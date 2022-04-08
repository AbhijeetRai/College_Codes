list1 = ['Kanha','Rahul','Badhe','Shashi','Ashish','Prasad']
list2 = ['Rahul','Ashish']

for var1 in list1 :
    if('s' in var1):
        break

    for var2 in list2:
        if(var1==var2):
            break
        else:
            print(var1)
