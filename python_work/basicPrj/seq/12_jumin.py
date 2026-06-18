jumin = '890320-1234567'
#  생년월일(년-월-일)
# 올해한국나이 (단 올해년도는 미리 정해줌)
pos = int(jumin[7])
print("성별 : {}".format("여남"[pos%2]))
print("국적 : {}국인".format("내외"[pos//5]))
year = ((pos-1)%4//2+19)*100+int(jumin[:2])
print("생년월일 : {}-{}-{}".format(year,jumin[2:4],jumin[4:6]))
now = 2026
print("한국나이 : {}".format(now-year))