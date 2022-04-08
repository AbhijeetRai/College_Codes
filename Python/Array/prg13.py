from array import *
a = array('i',[int(x) for x in input('Enter multiple integer values\n').split()])
b = array(a.typecode,(val * 2 for val in a))

for i in b:
    print(i)
