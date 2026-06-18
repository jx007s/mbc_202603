class Stud:
    def __init__(self,name, *jum):
        self.name = name
        self.__jum = jum    ##은닉화
                            ## 멤버요소 선언시 self.__xxx 인경우 xxx 요소 은닉화 함
        self.__calc()
    
    def __calc(self):   ## 은닉화함 (클래스 내부에서만 호출)
        self.tot = 0
        for j in self.__jum:
            self.tot+= j
        self.avg = self.tot/len(self.__jum)
        
    def ppp(self):
        print(f"{self.name}\t{self.__jum}\t{self.tot}\t{self.avg:.2f}")

studs = [
    Stud("한가인",67,68,62),
    Stud("두가인",77,78,72),
    Stud("세가인",57,58,52),
    Stud("사가인",97,98,92),
    Stud("오가인",87,88,82)
]

for st in studs:
    ##st.__calc()
    st.ppp()
    ##print(st.name, st.tot, st.__jum)
        