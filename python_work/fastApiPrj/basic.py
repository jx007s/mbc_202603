from fastapi import FastAPI

app = FastAPI(
    title="basic API"
)

@app.get("/")
def home():
    return {
        "msg":"basic API 고고"
    }