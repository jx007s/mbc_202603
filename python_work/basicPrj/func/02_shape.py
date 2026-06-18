def rect(ww,hh):
    return {
            "kind":"직사각형",
            "area":ww*hh,
            "border":(ww+hh)*2
        }
def clr(r):
    PI = 3.141592
    return {
            "kind":"원",
            "area":r**2*PI,
            "border":r*2*PI
        }
    
def shape(*lines):
    if len(lines)==2:
        return rect(lines[0],lines[1])
    if len(lines)==1:
        return clr(lines[0])
    
print(shape(5,6))
print(shape(5))
print(shape(10,20))
print(shape(10))
print(shape(7,7))