try:
    arr = (11,22,33)
    print(f"try 실행1")
    #a = 10/0
    print(f"try 실행2")
    #print(arr[5])
    print(f"try 실행3")
    raise Exception("사용자정의에러")
    print(f"try 실행4")
except ZeroDivisionError as e:
    print(f"except 실행1 {e}")
except IndexError as e:
    print(f"except 실행2 {e}")
except Exception as e:
    print(f"except 실행3 {e}")
finally:
    print(f"finally 실행")
    
print(f"try~except~finally 종료")


'''
07_try369.py
1->20 369를 if 문을 사용하지 않고 출력하세요
try~catch 사용


'''

