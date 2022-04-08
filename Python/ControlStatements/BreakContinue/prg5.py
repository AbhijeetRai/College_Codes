ls = ['Shashi','Ashish','Kanha','Rahul','Badhe','Prasad']

for name in ls:
    if('s' in name):
        continue
    else:
        print(name)

print()

for name in ls:
    flag=0
    for i in name:
        if(i == 's'):
            flag=1
            break
    print(name) if(flag==0) else 1
