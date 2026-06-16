if True:
    print("참이지롱1")      ## 제어문 구간표시는 들여쓰기
 #print("참이지롱2")            들여쓰기의 칸이 맞아야한다.  
      #print("참이지롱3")

if True:
#print("참이지롱1")   실행구문이 필요
    pass  #실행구문 없이 처리할 경우 pass사용

no = 67
if no >= 80 :
    print("우수")
elif no >= 60 :
    if no % 2 == 0:
        print("짝수")
    else:
        print("홀수")
    print("양호")    
elif no >= 40 :
    print("정상")
else :
    print("미달")

no = 90    
if no > 70:
    print("70이상")    
    a = "아기상어"

print("a : ", a)
