#extend() - extends array by appending elements from iterable

from array import *

a = array('i',[1,2,3,4])
a.extend([5,6])
a.extend((7,8))

#array takes atmost 2 arguments 3 given
#b = array('i',9,10)
'''
i is first parameter
9 is second
10 is third
'''

b = array('i',[9,10])
a.extend(b)

for i in a:
    print(i)
