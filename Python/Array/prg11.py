ls = [1,2,3,4]

from array import *

a = array('i',ls)
b = array('i',(i * 2 for i in ls))

for itr in range(len(ls)):
    print(a[itr],b[itr],sep="\t")
