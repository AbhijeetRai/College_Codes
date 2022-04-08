ls = [1,2,3,4]
tp = (1,2,3,4)
st = {1,2,3,4}

from array import *

a = array('i',ls)
b = array('i',tp)
c = array('i',st)

for i in range(len(a)):
    print(a[i],b[i],c[i],sep=" - ")
print()
