# for i=0;i<10;i+=1:
#     pass

arr1 = [11,22,33,11,55,77]
print("arr1 :", arr1)

for i in arr1:
    print(i)
    
r1 = range(10)  # 0,1,2,3,4,5,6,7,8,9
print("r1 : ", r1)
for i in r1:
    print(i)
print("range(10)------------")    
for i in range(10):
      #초기값=0,조건,증감=1
    print(i)    
print("range(10,15)------------")    
for i in range(10,15):
            #초기값,조건,증감=1
    print(i) 
print("range(100,200,10)------------")    
for i in range(100,200,10): 
            #초기값,조건,증감
    print(i) 
    
print("아기상어", end="=>")
print("뚜루루뚜루",end="\t\t")
print("귀여운")
print("뚜루루뚜루", end="\n")  ## 초기값  end="\n"
print("바닷속", end=" ")
print("뚜루루뚜루")
print("아기상어")
print("뚜루루뚜루")