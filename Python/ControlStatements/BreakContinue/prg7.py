ls1 = ['Shahsi','Ashish','Rahul','Kanha','Badhe','Prasad']
ls2 = ['Rahul','Ashish','Shardul']

for var in ls2:
    if(var not in ls1):
        print(var)

print()

for var2 in ls2:
    flag=0
    for var1 in ls1:
        if(var2==var1):
            flag=1
            break
    print(var2) if(flag==0) else 1
