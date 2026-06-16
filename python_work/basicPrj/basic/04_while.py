i = 0
while i<5:
    print('while 실행', i)
    i+=1
print('while 종료-------1')

# 1-> 100 짝수들의 합

i = 1
tot = 0
while i<=100:
    i+=i%2
    tot+=i
    print('while 실행', i,tot)
    
    i+=2
print('합계1 :', tot)