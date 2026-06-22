import cv2
import numpy as np
from ultralytics import YOLO
import os

pts = []

def draw_roi(event, x, y, flags, param):
    if event == cv2.EVENT_LBUTTONDOWN:
        pts.append((x, y))
        print(f"점 추가: ({x}, {y})")

# 1. 모델 비디오 로드
model = YOLO('yolo11n.pt')
video_path = 'traffic_cctv_1.mp4'

if not os.path.exists(video_path):
    print(f"에러: '{video_path}' 파일을 찾을 수 없습니다. 경로를 확인하세요.")
    exit()

cap = cv2.VideoCapture(video_path)
ret, first_frame = cap.read()

if not ret:
    print("에러: 영상 프레임을 읽을 수 없습니다.")
    exit()

# 1. ROI 설정
window_setup = 'Setup: Click Points, then Enter'
cv2.namedWindow(window_setup, cv2.WINDOW_NORMAL) # 창 조절 가능 설정
cv2.resizeWindow(window_setup, 1280, 720) # 초기 창 크기 설정
cv2.setMouseCallback(window_setup, draw_roi)

print("ROI를 설정하세요. (최소 4개)")
print("처음 찍는 4개의 점이 실제 '10m x 50m' 구역이 됩니다.")

while True:
    img_draw = first_frame.copy()
    for i, p in enumerate(pts):
        color = (0, 0, 255) if i < 4 else (255, 0, 0) # 처음 4개 점(기준점)은 빨간색, 이후는 파란색
        cv2.circle(img_draw, tuple(p), 7, color, -1)

    if len(pts) >=2 :
        cv2.polylines(img_draw, [np.array(pts)], True, (0, 255, 0), 2)

    cv2.imshow(window_setup, img_draw)
    key = cv2.waitKey(1) & 0xFF
    if key == 13 and len(pts) >= 4:
        break
    elif key == ord('c'):
        pts = []

cv2.destroyWindow(window_setup)

# 2. Homography Matrix 계산 (처음 4개 점 기준)
pts_src = np.array(pts[:4], dtype='float32')
pts_dst = np.array([[0, 0], [10, 0], [0, 50], [10, 50]], dtype='float32')
H, _ = cv2.findHomography(pts_src, pts_dst)
roi_poly = np.array(pts, np.int32)

# 3. 실시간 추론 및 거리 측정 루프
main_win = 'Smart Traffic Analyzer'
cv2.namedWindow(main_win, cv2.WINDOW_NORMAL)
cv2.resizeWindow(main_win, 1280, 720)

while cap.isOpened():
    ret, frame = cap.read()
    if not ret:
        break

    # YOLO 추론 ; 차량만 탐지
    results = model(frame, stream=True, conf=0.5, show=False)

    for r in results:
        for box in r.boxes:
            cls_id = int(box.cls[0])
            if cls_id in [2, 3, 5, 7]:
                x1, y1, x2, y2 = map(int, box.xyxy[0])
                cx, cy = (x1 + x2) // 2, y2

                if cv2.pointPolygonTest(roi_poly, (cx, cy), False) >= 0:
                    px_point = np.array([[[cx, cy]]], dtype='float32')
                    real_pos = cv2.perspectiveTransform(px_point, H)
                    ry = real_pos[0][0][1]

                    label = f"{model.names[cls_id]} {ry:.1f}m"
                    cv2.rectangle(frame, (x1, y1), (x2, y2), (0, 255, 0), 2)
                    cv2.putText(frame, label, (x1, y1- 10),
                                cv2.FONT_HERSHEY_SIMPLEX, 0.6, (0, 255, 0), 2)
                else:
                    cv2.rectangle(frame, (x1, y1), (x2, y2), (150, 150, 150), 1) # 구역 밖 객체 흐리게 처리

    overlay = frame.copy()
    cv2.fillPoly(overlay, [roi_poly], (0, 255, 0))
    cv2.addWeighted(overlay, 0.15, frame, 0.85, 0, frame)
    cv2.polylines(frame, [roi_poly], True, (0, 255, 0), 2)

    cv2.imshow(main_win, frame)

    if cv2.waitKey(25) & 0xFF == ord('q'):
        break

cap.release()
cv2.destroyAllWindows()