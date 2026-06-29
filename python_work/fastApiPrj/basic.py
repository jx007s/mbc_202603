from fastapi import FastAPI, UploadFile, File, Form

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
    return {
        "msg":"업로드처리",
        "ff":ff.filename,
        "pname":pname,
        "age":age
    }