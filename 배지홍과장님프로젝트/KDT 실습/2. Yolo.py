from ultralytics import YOLO

# 1. YOLO 모델 로드
model = YOLO('yolo11n.pt')

# 2. 이미지/영상 소스 추론 수행
results = model('traffic_cctv_1.mp4', save=True, conf=0.5, show=True)

# 3. 검출 결과 필터링
# 클래스 번호 : 2(Car), 3(Motorcycle), 5(Bus), 7(Truck)
for result in results:
    boxes = result.boxes
    for box in boxes:
        if box.cls in [2, 3, 5, 7]:
            print(f"Vehicle Detected at: {box.xyxy}")





