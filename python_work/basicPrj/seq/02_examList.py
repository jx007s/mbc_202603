oriData = [
    ['장동건',77,79,72],
    ['장서건',67,69,62],
    ['장남건',97,99,92],
    ['장중건',87,89,82]
]
resData = [
    [0,0],
    [0,0],
    [0,0],
    [0,0]
]


## 2. 연산부
no = 0
for dd in oriData:
    resData[no][0] = 0
    for j in dd[1:]:
        #print(j)
        resData[no][0] += j
    resData[no][1] = resData[no][0]//3
    #print(dd, resData[no])
    no+=1
    
## 3. 출력부
no = 0
while no<4:
    print(oriData[no], resData[no])
    no+=1