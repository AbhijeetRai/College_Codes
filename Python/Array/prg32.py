from array import *

a = array('i',[1,2,3,4,5,6])

for i in range(len(a)):
    print(a[i],end=" ")

print('\nupdated')

a[2] = 6
for i in range(len(a)):
    print(a[i],end=" ");

print('\nupdated')

a[4] = 8
for i in range(len(a)):
    print(a[i],end=" ");
print()
