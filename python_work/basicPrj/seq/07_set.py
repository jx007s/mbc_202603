## set - 중복이 없고, 순서가 없음
arr1 = [10,'a',20,30,10,80,90,10,20,30]
tt1 = (10,'a',20,30,10,80,90,10,20,30)
s1 = set(arr1)
s2 = set(tt1)

print("s1", s1)
print("s2", s2)
#print(s1[0])     원소번호에 의한 접근 불가
#s1[0] = 100

print(type(arr1))
print(type(tt1))
print(type(s1))

print(len(s1))
print(80 in s1)
s1.add(1111)
print("add", s1)
#s1.append(1111)
#s1.insert(2222, 2)
s1.update([2222,3333,4444]) ## 원소들을 분해하여 추가
print("update", s1)
s1.remove(2222)
print("remove", s1)
#s1.remove(9876) 존재하지 않는 원소 삭제 불가
#del s1[2]
#s1.index(80)

print("-----------")
for i in s1:
    print(i)

s1.clear()
print("clear", s1)