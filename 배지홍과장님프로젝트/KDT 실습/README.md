# ＫＤＴ 실습

# 주요 파일

# 사용 방법

# 개발 환경 구축 방법
1. 파이참으로 프로젝트를 받아온다.
2. 터미널을 Git Bash로 설정한다.
3. 터미널을 실행하여 가상환경을 생성한다.
```
py -3.11 -m venv venv
또는
python3.11 -m venv venv
```
4. 'venv/pyvenv.cfg' 파일을 열어서 아래와 같이 속성 값을 변경한다.
```
include-system-site-packages = true
```
5. 가상환경을 활성화한다.
```
source venv/Scripts/activate 
또는
source venv/bin/activate
```
6. 파이썬 모듈을 설치한다.
```
pip install -r dependencies.txt
```
7. 파이참의 파이썬 인터프리터 가상환경 설정에서 생성한 가상환경을 사용하도록 설정한다.