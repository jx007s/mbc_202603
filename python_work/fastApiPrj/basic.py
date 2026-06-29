from fastapi import FastAPI, UploadFile, File, Form
import shutil
import easyocr
import numpy as np
import cv2

## 서버 시작시 한번만 모델 로드
reader = easyocr.Reader(["ko","en"], gpu=False)

app = FastAPI(
    title="basic API"
)

@app.get("/")
def home():
    return {
        "msg":"basic API 고고"
    }
    
@app.get("/location")
def location(pname: str):
    ## pname: str 매개변수
    # http://127.0.0.1:8000/location?pname=abcd
    # pname : abcd
    print(f"location 진입 : {pname}")
    return {
        "msg":"오시는 길",
        "pname":pname
    }
    
@app.post("/ocr")
async def ocr(  ## async 비동기 처리
            ff:UploadFile=File(...),    ##폼 ff : File
            pname:str=Form(...),          ##폼 pname : str  
            age:int=Form(...)             ##폼 age : int
                                        ##Form(...) 필수라는 의미
            
            ##요청지에서 폼으로 매개변수를 보내지 않을 경우  "type": "missing" 에러발생
        ):
    
    ## 파일 저장(지금은 필요없음)
    # filePath = f"mmm/{ff.filename}"
    # with open(filePath, "wb") as buffer:
    #     shutil.copyfileobj(ff.file, buffer)
    
    contents = await ff.read()
    img = np.frombuffer(contents, np.uint8)
    img = cv2.imdecode(img, cv2.IMREAD_COLOR)
    
    res = reader.readtext(img, detail=0)
    
    print(res)
    
    return {
        "msg":"업로드처리",
        "ff":ff.filename,
        "pname":pname,
        "age":age,
        "res":res
    }