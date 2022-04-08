# In python there is no issue, if we write something beneath break and continue immediately

for i in range(1, 6):

    if(i == 2):
        continue
        print('i is 2')

    elif(i == 4):
        break
        print('i is 4')

    else:
        print(i)
