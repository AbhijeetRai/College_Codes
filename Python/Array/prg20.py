from array import *

a = array('i',[1,2,3,1,5])

for i in a:
    print(i,end=" ")
print()

#last element removed
a.pop()
for i in a:
    print(i,end=" ")
print()

#element at 2 index removed
a.pop(2)
for i in a:
    print(i,end=" ")
print()

#first occurance of 1 removed
a.remove(1)
for i in a:
    print(i,end=" ")
print()
