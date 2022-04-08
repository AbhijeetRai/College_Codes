from array import *

a = array('i',[1,2,3])

#only pop returns and removes last element
#remove only removes returns nothing
print(a.remove(1))

for i in a:
    print(i)

#a.remove(4)
#value Error: array.remove(x) : x not in list

#1 has been removed
#now array contains of 2,3

x = len(a)
print('length is ',x)

for i in range(x):
    print('the element at',i,'index is',a[i])

#a.pop(2)
#pop index out of range, there is no element at index 2
#element is only present at index 0 and index 1
