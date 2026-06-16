pname = '장동건'
kor = 88
eng = 72
mat = 92
tot = kor + eng +mat
avg = tot // 3

if avg>= 90:
    grade = '수'
elif avg>= 80:
    grade = '우'
elif avg>= 70:
    grade = '미'
elif avg>= 60:
    grade = '양'
else:
    grade = '가'
    
print('이름:',pname)
print('국어:',kor)
print('영어:',eng)
print('수학:',mat)
print('총점:',tot)
print('평균:',avg)
print('등급:',grade)
