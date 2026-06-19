from datetime import datetime as dt

now = dt.today()
pre = now.strftime("%Y-%m-")
now = dt.strptime(f"{pre}1","%Y-%m-%d")
ww = now.strftime("%w")
for i in range(0,int(ww)):    
    print("",end="\t")

for i in range(1,31):    
    now = dt.strptime(f"{pre}{i}","%Y-%m-%d")
    ww = now.strftime("%w")
    print(i,end="\t")
    if int(ww)==6:
        print()
