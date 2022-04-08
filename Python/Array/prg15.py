ls = [int(x) for x in input('Enter multiple values').split()]

from array import *

a = array('i',(i * 5 for i in ls))

for val in a:
    print(val)
