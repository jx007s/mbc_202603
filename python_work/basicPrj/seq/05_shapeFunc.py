ori = [
[3,4,5],
[1,2],
[7],
[10,20],
[3,4],
[9],
[8],
[11,16,18]
]

res = [[],[],[]]

for oo in ori:
    res[len(oo)-1].append(oo)
    
for oo in res:
    print(oo)