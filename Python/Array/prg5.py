#passing elements from command line to integer array

from array import *
from sys import argv

ls = list()

for i in range(1,len(argv)):
    ls.append(int(argv[i]))

a = array('i',ls)
print(a)
