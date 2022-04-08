a = [int(x) for x in input('Enter the elements of first array\n').split()]
b = [int(x) for x in input('Enter the elements of second array\n').split()]

from array import *

a = array('i',a)
b = array('i',b)

for itr in range(len(a)):
    print(a[itr]+b[itr])
