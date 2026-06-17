ori=[11,5,7,99,34,12,11,5,99,34,12,7,5,12,5,34,12]

res={}

# for oo in ori:
#     no = 1
#     if oo in res:
#         no += res[oo]
#     res[oo] = no
#     #print(oo)

for oo in ori:
    res[oo] = ori.count(oo)
    

    
for r in res:
    print(r,res[r])