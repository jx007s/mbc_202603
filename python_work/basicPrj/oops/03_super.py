class Par:
    a = "부모a" ##스태틱한 멤버변수
    b = "부모b"
    
    def __init__(self, c):
        self.c = c      ##인스턴스한 멤버변수
        print("부모 생성자")
        
    def fn_1(self):
        print(f"부모 fn_1() 실행 : {self.a}, {self.b}, {self.c}")
        
    def fn_2(self):
        print(f"부모 fn_2() 실행 : {self.a}, {self.b}, {self.c}")
    
    def __str__(self):   ## toString()
        return f"부모 : {self.a}, {self.b}, {self.c}"
    
class Par22:
    e = "외국아빠e"
    f = "외국아빠f"
    
    def fn_5(self):
        print(f"외국아빠 fn_5() 실행 : {self.e}, {self.f}")

## 클래스 상속 - 다중상속 가능
# class 자식클래스명(부모클래스명1,부모클래스명2...):

class Child(Par, Par22):
    b = "자식b"     ##부모 멤버와 중첩 - overriding
    d = "자식d"
    
    def __init__(self):
        ## super() : 부모접근자
        ## 부모생성자가 사용자정의로만 선언된경우 자식 생성자에서 호출 필수
        super().__init__("자식생성c")
        print("자식 생성자")
    
    def fn_2(self):     ##부모 멤버와 중첩 - overriding
        print(f"자식 fn_2() 실행 : {self.a}, {self.b}, {self.c}, {self.d}")
    
    def fn_3(self):
        print(f"자식 fn_3() 실행 : {self.a}, {self.b}, {self.c}, {self.d}")
    
    def __str__(self):  ##overriding
        return f"{super().__str__()} + {self.d}"
        

cc1 = Child()
cc2 = Child()
print(cc1)
print(f"{cc1.a},{cc1.b},{cc1.c},{cc1.d},{cc1.e},{cc1.f}")
cc1.fn_1()
cc1.fn_2()  ##자식
cc1.fn_3()
cc1.fn_5()
print(f"Par : {Par.a},{Par.b}")
#print(f"Par : {Par.a},{Par.b},{Par.c}")
Par.fn_1(cc1)
Par.fn_2(cc1)   ##부모호출

print("cc2------------")
print(cc2)
print(f"{cc2.a},{cc2.b},{cc2.c},{cc2.d}")
cc2.fn_1()
cc2.fn_2()  ##자식
cc2.fn_3()

print("cc1 , cc2 , Par------------")
Par.a = "아기상어"
print(f"{cc1.a}, {cc2.a}, {Par.a}")
cc2.a = 1357
cc1.a = 2468
print(f"{cc1.a}, {cc2.a}, {Par.a}")
Par.a = "엄마상어"
print(f"{cc1.a}, {cc2.a}, {Par.a}")

'''
04_shape.py
도형 클래스를 구현하세요
상위    : 
도형 : 이름,   넓이, 둘레 , 출력함수
하위 : 사각형   직각삼각형 ---> 계산함수

각 도형의 이름, 넓이, 둘레를 출력하세요
'''

    