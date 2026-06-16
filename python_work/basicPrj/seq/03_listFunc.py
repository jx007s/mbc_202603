a = [11,22,33,44,22,55,66,77,99,22]
print("a:",a)
print("len:",len(a))    #원소갯수

##CRUD
a.append(1234)      ## 마지막에 추가
print("append:",a)
a.insert(2,5678)      ## 중간에 추가
##      인덱스, 요소
print("insert:",a)
a.remove(55)        ## 원소값 55 제거
print("remove:",a)
del a[3]            ## 원소 3번째 제거
print("del:",a)
r = a.pop()         ## 마지막 원소 삭제하여 r에 대입
print("pop:",a)
print("r:",r)
r = a.pop(3)        ## 3번째 원소 삭제하여 r에 대입
print("pop(3):",a)
print("r:",r)
a.extend([999,888,777]) ##  리스트의 원소를 분해하여 마지막 대입
print("extend:",a)

## 조회
print("77 in a", 77 in a)  ## 존재유무
print("100 in a", 100 in a)  ## 존재유무
print("count(22)", a.count(22))  ## 해당 원소 갯수
print("count(100)", a.count(100))
print("index(22)", a.index(22))     ##해당원소 위치
##print("index(100)", a.index(100))     ##없으면 애러
print("index(22,4)", a.index(22,4)) ## 22를 4번째이후부터 검색
#print("index(22,4,6)", a.index(22,4,6)) ## 4~6 사이에서 검색

## 변환
a.reverse()
print("reverse", a)  ## 뒤집기

import random
random.shuffle(a)
print("shuffle", a)  ## 섞기
a.sort()    ##정렬
print("sort", a)
ttt = str(a)    ##문자열<-list
print("str", ttt)
#a+"아기상어" 리스트+문자열 불가
print(ttt+"아기상어")