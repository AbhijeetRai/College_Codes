#list is unpacked
a, b = [1, 2]
print(a)
print(b)
print()

#set is unpacked too
a,b = {2, 3}
print(a)
print(b)
print()

#tuple is unpacked too
a, b = (0, 2 ** 0.5)
print(a)
print(b)
print()

#key of dictationary is unpacked too
a, b = {7 : "MSD", 10 : "Sachin",}
print(a)
print(b)
print()

#A string is unpacked too
a, b, c, d  = 'ABHI'
print(a)
print(b)
print(c)
print(d)
print()

#An array is unpacked too
from array import array
a = array('i', [101, 202, 303])
a, b, c = a
print(a)
print(b)
print(c)
