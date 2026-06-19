class Shape:
    name=""
    area = 0
    border = 0
    
    def calc(self):
        pass
    
    def __str__(self):
        self.calc()
        return f"{self.name}\t{self.area}\t{self.border}"
    
class Rec(Shape):
    
    def __init__(self,ww,hh):
        super().__init__()
        self.name="직사각형"
        self.ww = ww
        self.hh = hh
    
    def calc(self):
        self.area = self.ww*self.hh
        self.border = (self.ww+self.hh)*2
        
class Tri(Shape):
    
    def __init__(self,ww,hh,aa):
        super().__init__()
        self.name="직각삼각형"
        self.ww = ww
        self.hh = hh
        self.aa = aa
    
    def calc(self):
        self.area = self.ww*self.hh / 2
        self.border = self.ww+self.hh+self.aa
        
print(Rec(5,6))
print(Rec(10,20))
print(Tri(10,5,12))
print(Tri(7,7,13))