from array import *

#d - floating point
a = array('d',[1.1,3.2,4])

for i in a:
    print(i)

#i - integer
#error - integer argument expected got float
a = array('i',[1,2,3,3.3])
for i in a:
    print(i)
