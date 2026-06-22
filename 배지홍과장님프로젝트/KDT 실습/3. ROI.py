import cv2
import numpy as np
from ultralytics import YOLO

pts = []

def draw_roi(event, x, y, flags, param):
    if event == cv2.EVENT_LBUTTONDOWN:
        pts.append((x, y))
        print(f"점 추가: ({x}, {y})")

# 1. 모델 및 비디오 로드
model = YOLO('yolo11n.pt')
cap = cv2.VideoCapture('traffic_cctv_1.mp4')

# 2. ROI 설정 단계
ret, first_frame = cap.read()
if not ret:
    print("영상을 읽을 수 없습니다.")
    exit()

cv2.namedWindow('Select Polygon ROI')
cv2.setMouseCallback('Select Polygon ROI', draw_roi)

while True:
    img_draw = first_frame.copy()
    if len(pts) > 0:
        for p in pts:
            cv2.circle(img_draw, p, 5, (0, 0, 255), -1)
        if len(pts) > 1:
            cv2.polylines(img_draw, [np.array(pts)], isClosed=False, color=(0, 255, 0), thickness=2)
        if len(pts) >= 3:
            overlay = img_draw.copy()
            cv2.fillPoly(overlay, [np.array(pts)], (0, 255, 0))
            cv2.addWeighted(overlay, 0.3, img_draw, 0.7, 0, img_draw)
            cv2.polylines(img_draw, [np.array(pts)], isClosed=True, color=(0, 255, 0), thickness=2)

    cv2.imshow('Select Polygon ROI', img_draw)
    key = cv2.waitKey(1) & 0xFF
    if key == 13: # Enter
        if len(pts) < 3: continue
        break
    elif key == ord('c'):
        pts = []

cv2.destroyWindow('Select Polygon ROI')
roi_poly = np.array(pts, np.int32)

# 3. 실시간 추론 루프
while cap.isOpened():
    ret, frame = cap.read()
    if not ret: break

    results = model(frame, stream=True, conf=0.5, verbose=False)

    for r in results:
        for box in r.boxes:
            cls_id = int(box.cls[0])
            label = model.names[cls_id]
            conf = float(box.conf[0])

            if cls_id in [2, 3, 5, 7]:
                x1, y1, x2, y2 = map(int, box.xyxy[0])
                cx, cy = (x1 + x2) / 2, y2

                # ROI 내부 여부 확인
                is_inside = cv2.pointPolygonTest(roi_poly, (cx, cy), False)

                if is_inside >= 0:
                    color = (0, 0, 255)
                    cv2.rectangle(frame, (x1, y1), (x2, y2), color, 3)

                    text = f"IN: {label} {conf:.2f}"
                    (w, h), _ = cv2.getTextSize(text, cv2.FONT_HERSHEY_SIMPLEX, 0.6, 2)
                    cv2.rectangle(frame, (x1, y1 - h - 10), (x1 + w, y1), color, -1)
                    cv2.putText(frame, text, (x1, y1 - 5),
                                cv2.FONT_HERSHEY_SIMPLEX, 0.6, (255, 255, 255), 2)
                else:
                    cv2.rectangle(frame, (x1, y1), (x2, y2), (150, 150, 150), 1)
                    cv2.putText(frame, label, (x1, y1 -5),
                                cv2.FONT_HERSHEY_SIMPLEX, 0.4, (150, 150, 150), 1)

    # ROI 구역 시각화
    overlay = frame.copy()
    cv2.fillPoly(overlay, [roi_poly], (0, 255, 0))
    cv2.addWeighted(overlay, 0.15, frame, 0.85, 0, frame)
    cv2.polylines(frame, [roi_poly], True, (0, 255, 0), 2)

    cv2.imshow('Advanced Traffic Analyzer', frame)

    if cv2.waitKey(25) & 0xFF == ord('q'):
        break

cap.release()
cv2.destroyAllWindows()