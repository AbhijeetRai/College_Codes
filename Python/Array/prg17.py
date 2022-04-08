from array import *

a = array('i',[10,20,30])

for i in range(0,3):
    print(a[i],end=" ")

a.append(40)

print('the appended array')
for i in range(0,4):
    print(a[i],end=" ")

print()
a.insert(2,50)
for i in range(0,5):
    print(a[i],end=" ")
