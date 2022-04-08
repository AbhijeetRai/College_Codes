import array as ar
import numpy as np

#a = ar.array('i', 1)    #initializer must be iterable
#a = ar.array('d', 1.1)  #initializer must be iterable

a = np.array(1)
print(a, type(a))

b = np.array(1.1)       #works even if object is not iterable
print(b, type(b))

c = np.array("Abhi")
print(c, type(c))

# d = np.array(1, 2) #data type is not understood
# print(d, type(d))  #scond paramter in numpy.array is dtype
