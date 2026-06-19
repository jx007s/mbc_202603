import sys
#print(sys.path)
print(sys.argv)## 실행시 매개변수들을 리스트형태로 호출
## python 01_func.py aaa bbb ccc ddd 
##['01_func.py', 'aaa', 'bbb', 'ccc', 'ddd']

import os
print(os.getcwd())      ## 현재 디렉토리
print(os.path.exists('../fff/back.png'))    ##존재유무
print(os.path.isdir('../fff/back.png'))    ##디렉토리인지
print(os.path.isfile('../fff/back.png'))    ##파일인지
arr = os.listdir('../fff/') ##폴더내 파일,폴더 문자열list로
print(arr)    
print(os.path.getsize('../fff/back.png'))    ##파일크기
print(os.path.getctime('../fff/back.png'))     ##생성일
print(os.path.getmtime('../fff/back.png'))   ##수정일
print(os.path.getatime('../fff/back.png'))    ##액세스 날짜

#os.mkdir('../fff/asdf') 폴더생성
#os.rmdir('../fff/asdf') #폴더삭제
#os.unlink('../fff/AKYO5468.JPG')    ##파일삭제
#os.rename('../fff/ccc.xlsx','../fff/mmm.xlsx')##파일이동

from datetime import datetime as dt

print(dt.now())
print(dt.today())

now = dt.now()

## 날짜시간 --strftime---> 문자열
print(now.strftime('%Y-%m-%d'))
##월의 영문표기(Jun June)
print(now.strftime('%b %B'))
#%w : 0(일)~6(토)
print(now.strftime('%A %a %w'))
print(now.strftime('%H:%M:%S %p'))

## 문자열 --strptime---> 날짜시간
birth = dt.strptime('1997-03-20 13:15:23' ,'%Y-%m-%d %H:%M:%S')
print(birth)

### 02_diary.py 이번달력을 출력하세요