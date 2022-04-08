from array import *

a = array('i',(1,2,3,4))
print(a.itemsize) #4

a = array('d',(1.0,2.0))
print(a.itemsize) #8
#itesize  - length in bytes of one array item
