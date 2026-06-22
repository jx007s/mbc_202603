import cv2
import numpy as np
import os
import sys
from ultralytics import YOLO

# 1. 전역 변수 및 설정
pts = []
vehicle_history = {}
ALPHA = 0.15  # 속도 보정 계수


def select_points(event, x, y, flags, param):
    if event == cv2.EVENT_LBUTTONDOWN:
        pts.append([x, y])
        print(f"점 {len(pts)} 추가: ({x}, {y})")


# 2. 모델 및 비디오 로드
model = YOLO('yolo11n.pt')
video_path = 'traffic_cctv_1.mp4'

if not os.path.exists(video_path):
    print(f" 에러: '{video_path}' 파일을 찾을 수 없습니다.")
    sys.exit(1)

cap = cv2.VideoCapture(video_path)
fps = cap.get(cv2.CAP_PROP_FPS)
if fps == 0 or fps > 100: fps = 30.0
time_interval = 1 / fps

# 3. ROI 및 Homography 설정
ret, first_frame = cap.read()
setup_win = 'Setup: Click 4 Points CLOCKWISE, then ENTER'
cv2.namedWindow(setup_win, cv2.WINDOW_NORMAL)
cv2.resizeWindow(setup_win, 1280, 720)
cv2.setMouseCallback(setup_win, select_points)

while True:
    img_draw = first_frame.copy()
    for i, p in enumerate(pts):
        cv2.circle(img_draw, tuple(p), 7, (0, 0, 255), -1)
        cv2.putText(img_draw, str(i + 1), tuple(p), cv2.FONT_HERSHEY_SIMPLEX, 1, (255, 255, 255), 2)
    if len(pts) >= 2:
        cv2.polylines(img_draw, [np.array(pts)], True, (0, 255, 0), 2)

    cv2.imshow(setup_win, img_draw)
    if cv2.waitKey(1) & 0xFF == 13 and len(pts) >= 4:  # ENTER
        break

cv2.destroyWindow(setup_win)

# 순서: 좌상 -> 우상 -> 우하 -> 좌하
pts_src = np.array(pts[:4], dtype='float32')
pts_dst = np.array([[0, 0], [10, 0], [10, 50], [0, 50]], dtype='float32')
H, _ = cv2.findHomography(pts_src, pts_dst)
roi_poly = np.array(pts, np.int32)

# 4. 실시간 추적 및 속도 산출 루프
main_win = 'STraffic Velocity Radar'
cv2.namedWindow(main_win, cv2.WINDOW_NORMAL)
cv2.resizeWindow(main_win, 1280, 720)

while cap.isOpened():
    ret, frame = cap.read()
    if not ret: break

    # YOLO 추적 엔진 가동
    results = model.track(frame, persist=True, stream=True, conf=0.4, verbose=False)

    for r in results:
        if r.boxes.id is not None:
            boxes = r.boxes.xyxy.cpu().numpy()
            ids = r.boxes.id.cpu().numpy().astype(int)
            clss = r.boxes.cls.cpu().numpy().astype(int)

            for box, obj_id, cls in zip(boxes, ids, clss):
                if cls in [2, 3, 5, 7]:
                    x1, y1, x2, y2 = map(int, box)
                    cx, cy = (x1 + x2) // 2, y2

                    # ROI 내부 여부 판정
                    if cv2.pointPolygonTest(roi_poly, (cx, cy), False) >= 0:
                        # 픽셀 좌표 -> 실제 미터 좌표 변환
                        curr_px = np.array([[[cx, cy]]], dtype='float32')
                        curr_real = cv2.perspectiveTransform(curr_px, H)[0][0]

                        if obj_id in vehicle_history:
                            prev_real = vehicle_history[obj_id]['last_pos']
                            prev_speed = vehicle_history[obj_id]['speed']

                            # 유클리드 거리 산출
                            dist = np.linalg.norm(curr_real - prev_real)
                            inst_speed = (dist / time_interval) * 3.6  # m/s to km/h

                            # v_final = alpha * v_inst + (1 - alpha) * v_prev
                            curr_speed = ALPHA * inst_speed + (1 - ALPHA) * prev_speed
                        else:
                            curr_speed = 0

                        vehicle_history[obj_id] = {'last_pos': curr_real, 'speed': curr_speed}

                        # 시각화
                        speed_val = f"{curr_speed:.1f} km/h" if curr_speed > 5 else "Waiting..."
                        cv2.rectangle(frame, (x1, y1), (x2, y2), (0, 255, 0), 2)
                        cv2.putText(frame, f"ID:{obj_id} | {speed_val}", (x1, y1 - 10),
                                    cv2.FONT_HERSHEY_SIMPLEX, 0.6, (0, 255, 0), 2)
                    else:
                        cv2.rectangle(frame, (x1, y1), (x2, y2), (100, 100, 100), 1)

    # ROI 영역 반투명 표시
    overlay = frame.copy()
    cv2.fillPoly(overlay, [roi_poly], (0, 255, 0))
    cv2.addWeighted(overlay, 0.15, frame, 0.85, 0, frame)

    cv2.imshow(main_win, frame)
    if cv2.waitKey(1) & 0xFF == ord('q'): break

cap.release()
cv2.destroyAllWindows()