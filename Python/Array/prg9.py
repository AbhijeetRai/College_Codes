ls1 = [1,2,3,4]
ls2 = list()

for i in ls1:
    ls2.append(2*i)

from array import *

a = array('i',ls1)
b = array('d',ls2)

for i in range(len(a)):
    print(a[i],b[i],sep = "\t")
