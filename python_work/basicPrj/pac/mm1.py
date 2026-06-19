aa = 10
bb = 20
def fn_1():
    print("fn_1() 실행")
    return 100

def fn_2(x,y):
    print(f"fn_2() 실행 {x},{y}")
    return x+y

if "__main__"==__name__:
    print("mm1 파일이지롱")
    print(__name__) ##mm1: import 되는 파일의 이름