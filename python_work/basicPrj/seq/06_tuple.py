## list =  [ 원소1, 원소2,...]
## tuple = ( 원소1, 원소2,...) : 수정 불가

a = (12,34,56,12,78,90,34)
##   0  1  2   3  4  5  6
print('a :',a)

print('a[2]',a[2])
print('a[-1]',a[-1])
print('a[-2]',a[-2])


#a[4] = 700         대입불가
#print('a :',a)


print('a[3:5]',a[3:5])  ## 슬라이싱 a[3],a[4]
print('a[:5]',a[:5])  ## 슬라이싱 a[0] ~ a[4]
print('a[3:]',a[3:])  ## 슬라이싱 a[3] ~ 끝

b = ('직사각형',5,6)
print('b :', b)

c = (12,34,56,78)
d = (34,90,78,45)
e = c+d     ## 리스트 결합
print(e)
f = c*3     ## 리스트 원소 중복
print(f)


a = (11,22,33,44,22,55,66,77,99,22)
print("a:",a)
print("len:",len(a))    #원소갯수

##CRUD
#a.append(1234)      ## 마지막에 추가
#print("append:",a)
#a.insert(2,5678)      ## 중간에 추가
##      인덱스, 요소
#print("insert:",a)
#a.remove(55)        ## 원소값 55 제거
#print("remove:",a)
#del a[3]            ## 원소 3번째 제거
#print("del:",a)
#r = a.pop()         ## 마지막 원소 삭제하여 r에 대입
#print("pop:",a)
#print("r:",r)
#r = a.pop(3)        ## 3번째 원소 삭제하여 r에 대입
#print("pop(3):",a)
#print("r:",r)
#a.extend([999,888,777]) ##  리스트의 원소를 분해하여 마지막 대입
#print("extend:",a)

## 조회
print("77 in a", 77 in a)  ## 존재유무
print("100 in a", 100 in a)  ## 존재유무
print("count(22)", a.count(22))  ## 해당 원소 갯수
print("count(100)", a.count(100))
print("index(22)", a.index(22))     ##해당원소 위치
print("index(22,4)", a.index(22,4)) ## 22를 4번째이후부터 검색


## 변환
#a.reverse()
#print("reverse", a)  ## 뒤집기

import random
#random.shuffle(a)
#print("shuffle", a)  ## 섞기
#a.sort()    ##정렬
#print("sort", a)
ttt = str(a)    ##문자열<-list
print("str", ttt)
#a+"아기상어" 리스트+문자열 불가
print(ttt+"아기상어")
