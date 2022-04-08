ls = [int(x) for x in input('enter marks\n').split()]
print(ls)
from array import *

a = array('i',(i + 7 for i in ls))

for i in a:
    print(i)
