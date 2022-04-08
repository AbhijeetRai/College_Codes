from array import *

a = array('i',[5,10,15])

for i in range(len(a)):
    print(a[i],end=" ")
print()
a.append(20)

for i in range(len(a)):
    print(a[i],end=" ");

print()

a.insert(3,25)

for i in range(len(a)):
    print(a[i],end=" ")
