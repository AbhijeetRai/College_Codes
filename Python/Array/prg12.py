from array import *

a = array('i',[1,2,3,4])
b = array(a.typecode,(var1 * 2 for var1 in a))

for i in range(len(a)):
    print(a[i],b[i])
