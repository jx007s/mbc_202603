import cv2

# 1. 비디오 파일 로드
cap = cv2.VideoCapture('traffic_cctv_1.mp4')

# 2. 실시간 프레임 전처리 루프
while cap.isOpened():
    ret, frame = cap.read()
    if not ret:
        break

    # 3. 해상도 규격확 (YOLO 입력 표준 640x640)
    resized = cv2.resize(frame, (640, 640))

    # 4. CLAHE 적용
    lab = cv2.cvtColor(resized, cv2.COLOR_BGR2LAB)
    l, a, b = cv2.split(lab)

    clahe = cv2.createCLAHE(clipLimit=2.0, tileGridSize=(8, 8))
    cl = clahe.apply(l)

    processed = cv2.merge((cl, a, b))
    final_frame = cv2.cvtColor(processed, cv2.COLOR_LAB2BGR)

    # 5. 결과 출력
    cv2.imshow('Processed Traffic Video', final_frame)

    # 'q' 키 누르면 종료
    if cv2.waitKey(1) & 0xFF == ord('q'):
        break

cap.release()
cv2.destroyAllWindows()







