from array import array

a = array('i', [1, 2 ,3])
b = a
b[0] = 10
print(a, id(a))
print(b, id(b))


print()

from copy import copy 

a = array('i', [1, 2 ,3,])
b = copy(a)
b[0] = 10
print(a, id(a))
print(b, id(b))