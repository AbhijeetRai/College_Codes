from array import *

a = array('i',[1,10,3])
#by default last element is popped
print(a.pop())

print('after pop')
for i in a:
    print(i,end=" ")
print()
#pop also takes index as parameter
print(a.pop(1))
print('after pop')
for i in a:
    print(i,end=" ")
