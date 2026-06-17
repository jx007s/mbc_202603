dd1 = {
    '사자':'포유류','독수리':'조류','사자':'고양이과',
    '호랑이':'고양이과'
}
print(dd1)
aa = 123

## key는 고정형태(hashable) 만 가능
dd2 = {
    aa : "변수지",
    True:"불이지",
    123.456:"실수지",
    #[11,22]:"리스트지",
    (11,22):"튜플이지"
}
print(dd2)
#print(dd1[0])
print(dd1["사자"])  # key에 의한 접근
print(dd1.get("사자"))
dd1["독수리"]="맹금류"  # 대입
dd1["오타니"]="이도류"  # 추가
print(dd1)
print(len(dd1))
#dd1.add("아보카도")
#dd1.remove("독수리")
del dd1["독수리"]   ##삭제
print(dd1)

## key 검색만 가능 value 검색 불가
print("사자" in dd1)
print("악어" in dd1)
print("이도류" in dd1)

#r = dd1.pop()
r = dd1.pop("호랑이")  ## 호랑이 가 삭제되면서 호랑이의 value 고양이과 리턴
print(dd1)
print(r)

print("-------------")
for d in dd1:   ## key 를 반복변수로 가져옴
    print(d, dd1[d])

kks = dd1.keys()    ##key를 묶음으로 리턴
print(kks)
arr = list(kks)
tt = tuple(kks)
ss = set(kks)
print(type(kks), kks)
print(type(arr), arr)
print(type(tt), tt)
print(type(ss), ss)

vvs = dd1.values()
print(type(vvs), vvs)

'''
10_num.py
11,5,7,99,34,12,11,5,99,34,12,7,5,12,5,34,12
==> 각 숫자들의 갯수가 몇개인지 파악해 주세요


'''
