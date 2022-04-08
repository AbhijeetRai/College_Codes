'''
arange function in numpy is same as range function in python
arange(start,stop,step,dtype)
'''

import numpy

a = numpy.arange(3)
print(a)

a = numpy.arange(3.0)
print(a)

a = numpy.arange(2.5, 3.4, 0.2)
print(a, type(a[0]))

a = numpy.arange(3,7)
print(a)

a = numpy.arange(3,7,2)
print(a)

'''
start is 3
stop is 9
step is -2
this goes in infinite loop
so nothing is returned
'''
a = numpy.arange(3,9,-2)
print(a)
