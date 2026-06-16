import random

print(random.randint(1,5)) ##  1<= x <= 5 난수 발생

arr=[]
lotto = set()

while True:
    no = random.randint(1,45)
    
    arr.append(no)
    lotto.add(no)
    
    if len(lotto) == 7:
        break
    
print(arr)
print(lotto)


'''
빙고게임을 구현하세요
경우의 수 : 1 ~90
화면 : 5 x  5 (총 25개)
숫자는 중복되지 않음
'''
