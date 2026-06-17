a = '서면 computer MBC academy Cam'
#    0 12345678901234567890123456   
print(a) 
print(a[1])
print(a[4:13]) ## 4~12
print(a[:20])
print(a[20:])
print(a[:-5])
print(a[:])
#a[1]='점'          변환불가
print("검색------")
print("C aC" in a)
print("아기상어" in a)
print(a.startswith("서면 c"))
print(a.startswith("C aC"))
print(a.endswith("y cam"))
print(a.endswith("C aC"))
print(a.count("C"))
print(a.count("qwer"))
print(a.index("C"))
print(a.index("C",15))
#print(a.index("C",15,20))  없을 경우 에러
print(a.rindex("C"))
print(a.find("C"))
print(a.rfind("C"))
print(a.find("C",15))
print(a.find("C",15,20))  ##없을 경우 -1

print("변환------")
print(a.upper())
print(a.lower())
print(a.replace("c","씨이지"))
arr = list(a)
print(arr)
a = "1234"
#print(a+100)
print(int(a)+100)
print(float("123.456")+100)
print(not bool("내용있음"))
print(str(True)+"정우성")
arr = "정우성,정남성,정중성,정북성".split(",")
print(arr)
a = "==>".join("나는무너")
print(a)
a = "==>".join(arr)
print(a)
a = "     MBC 컴퓨터     "
print(len(a))
b = a.rstrip()
print(len(b), b)
b = a.lstrip()
print(len(b), b)
b = a.strip()
print(len(b), b)
print('a',97, ord('a'), chr(97))
print("format----------")
print("10진:%d, 8진:%o, 16진:%x  실수:%.2f, 문자열:%s, 문자:%c"%(10,10,10,123.4567,"아기상어","왕"))
print("이름:{0}, 나이:{1}, 결혼:{2}".format("한가인",42,True))
print("나이:{1}, 이름:{0},  결혼:{2}".format("한가인",42,True))
print("이름:{}, 나이:{}, 결혼:{}".format("두가인",38,True))
#print("이름:{}, 나이:{age}, 결혼:{}".format("삼가인",age=38,True))
print("이름:{}, 나이:{age}, 결혼:{}".format("사가인",True,age=32))
print("국어:{:.1f}, 영어:{:.2f}, 수학:{:.2f}".format(87.123,78.456,62.152))
print("10진:{:d}, 8진:{:o}, 16진:{:x}".format(11,11,11))
print("시작{:<10},{:^10},{:>10}끝".format("아기","엄마","아빠"))
print("시작{:=<10},{:=^10},{:=>10}끝".format("아기","엄마","아빠"))
print("시작{:<5},{:^5},{:>5}끝".format("아기상어뚜루루뚜루1234","엄마상어뚜루루뚜루1234","아빠상어뚜루루뚜루1234"))

'''
12_jumin.py
주민번호를 이용하여 정보를 출력하세요890320-1234567
성별(남/여), 국적(내국인/외국인), 생년월일(년-월-일)
올해한국나이 (단 올해년도는 미리 정해줌)
'''
