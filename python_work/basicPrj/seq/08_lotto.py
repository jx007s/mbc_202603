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


bingo = set()
while True:
    bingo.add(random.randint(1,90))
    
    if len(bingo) == 25:
        break


arr2 = list(bingo) 
random.shuffle(arr2)   
i = 1
for b in arr2:
    print(b, end="\t  ")
    if i%5==0:
        print()
    i+=1


t1 = set(["박재상", "박정권", "최정", "김광현", "엄정욱", "박희수", "이호준"])  
t2 = set(["이호준", "엄정욱", "박재홍", "이신협", "장동건"])
fa = set(["이병규", "이승엽", "박정권", "장동건", "박용택", "홍성흔"])

print("변경전>>>>")
print("1군",t1)
print("2군",t2)
print("FA",fa)

newT1 = t1 - t2 - fa
newT2 = t2 - fa
newFA = fa -t1 - t2 
print("변경후>>>>")
print("1군",newT1)
print("2군",newT2)
print("FA",newFA)
