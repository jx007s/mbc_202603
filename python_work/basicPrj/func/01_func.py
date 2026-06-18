## 함수정의
##  def 함수명(매개변수1, 매개변수2,...):
##       블라블라 
##       return 리턴값   

def fn_1(aa,bb):
    print(f"fn_1 실행 {aa} , {bb}")
    return 1234

## 함수호출
ff = fn_1(10,20)
## 함수 실행후 리턴값 대입
print(f"ff:{ff}")
fn_1(30,40)
##fn_1(50,60,70)  호출시 매개변수 갯수 일치

def fn_2(aa,bb):
    print(f"fn_2 실행 {aa} , {bb} 리턴 : X")

def fn_3():
    print(f"fn_3 실행 매개변수X, 리턴: 5678")
    return 5678

def fn_4():
    print(f"fn_4 실행 매개변수X, 리턴: X")
    
ff = fn_2(11,22)
print(f"ff:{ff}")   ##리턴이 없는 경우 None 대입

ff = fn_3()
print(f"ff:{ff}") 

ff = fn_4()
print(f"ff:{ff}")   ##리턴이 없는 경우 None 대입

## 매개변수 초기값 : 매개변수명="초기값"
## 뒤에서부터 위치
def fn_init(aa,bb="아기상어",cc="엄마상어"):
    print(f"fn_init 실행 {aa}, {bb}, {cc}")    


fn_init(11,22,33)
fn_init(11,22)
fn_init(11)
#fn_init()

## 초기값 지정 매개변수 뒤에 일반 매개변수 불가
## def fn_init2(bb="아기상어",cc="엄마상어",aa):
##    print(f"fn_init2 실행 {aa}, {bb}, {cc}") 

## 포인터매개변수 : *매개변수 :: 이후에 입력되는 모든 매개변수를 묶어 tuple 처리
def fn_pp(name, *jum):
    print(f"name:{name}, jum:{jum}")

def fn_arr(name, jum):
    print(f"name:{name}, jum:{jum}")
    
fn_pp("정우성",11,22,33)    ## jum = (11,22,33)
#fn_arr("정남성",11,22,33)
fn_arr("정좌성",[11,22,33]) ##jum = [11,22,33]
fn_pp("정중성",[11,22,33]) ## jum[0] = [11,22,33]


def fn_initpp1(name,age=27, *jum):
    print(f"fip1 : name:{name},age:{age}, jum:{list(jum)}")

## jum 이후의 매개변수는 모두 jum tuple로 대입
## 따라서 age의 값은 없음 ==> 기본값 37로만 대입    
def fn_initpp2(name, *jum, age=37):
    print(f"fip2 : name:{name},age:{age}, jum:{jum}")
    
fn_initpp1("차은우",26,11,22,33) 
fn_initpp1("차은우",26,11) 
fn_initpp1("차은우",26) 
fn_initpp1("차은우") 


fn_initpp2("차은우",26,11,22,33) 
fn_initpp2("차은우",26,11) 
fn_initpp2("차은우",26) 
fn_initpp2("차은우") 

def fn_ret1():
    print(f"fn_ret1")
    return;

def fn_ret2():
    print(f"fn_ret2")
    return 100

def fn_ret3():
    print(f"fn_ret3")
    return 12,34,56;    ## 여러개일 경우 tuple로 묶어서 1개로 리턴

ff = fn_ret1()
print(f"ff:{ff}")
ff = fn_ret2()
print(f"ff:{ff}")
ff = fn_ret3()
print(f"ff:{ff}")

f1,f2,f3 = fn_ret3()    ## 리턴형태에 맞춰 다중의 변수로 대입가능
print(f"f1:{f1} f2:{f2}, f3:{f3}")

'''
02_shape.py
#### 도형의 넓이와 둘레를 구하는 함수를 만드세요
### 도형의 종류 : 사각형, 원
##### 넓이 :가로*세로 , 반지름*반지름*pi
##### 둘레 :(가로+세로)*2 , 2*반지름*pi
리턴 : 도형종류, 넓이, 둘레
'''
