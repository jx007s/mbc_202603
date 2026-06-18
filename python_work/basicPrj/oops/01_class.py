## 클래스 정의
class AAA:
    aa = 10 ##멤버변수
    bb = 20
    
    def __init__(self): ##생성자
        self.aa = "아기상어"
        self.cc = "엄마상어"    ##멤버변수 선언
        print("AAA 생성자 실행")
        
    
    def fn_1(self):         ##메소드, 매개변수 self 필수
        self.dd = "할머니상어"
        print(f"AAA.fn_1() 실행 {self.aa}, {self.bb}, {self.cc}, {self.dd}")

a1 = AAA()      ##인스턴스 생성 및 주소 대입
print(a1)
print(f"a1 aa:{a1.aa}, bb:{a1.bb}, cc:{a1.cc}")
#print(f"a1 aa:{a1.aa}, bb:{a1.bb}, cc:{a1.cc}, dd:{a1.dd}")
a1.fn_1()
print(f"a1 aa:{a1.aa}, bb:{a1.bb}, cc:{a1.cc}, dd:{a1.dd}")


'''
02_exam.py
학생 클래스를 구현하세요
입력 메소드를 정의하여 이름 , 국어,영어, 수학 입력
출력 내용 : 이름 과목점수, 총점, 평균
5명 이상
'''