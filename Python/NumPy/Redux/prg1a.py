import array as arr
a = arr.array('i')      #Initializer is optional
print(a)

#a = arr.array('i', 1)   #Only give iterable Initializer

a = arr.array('i', [1 , 2])
print(a)

#a = arr.array('i', [1, 2], [3, 4])  #Only give one Initializer
print('\n\n')

import numpy as np
#array(object, dtype=None, *, copy=True, order='K', subok=False, ndmin=0)
a = np.array(1)
print(a)

a = np.array("A")
print(a)

#a = np.array(1, 2) #Cannot interpret 2 as data type

a = np.array([1, 2, '3'])
print(a, type(a[0]))

#a = np.array([1, 2], [1, 2]) #Only give one Initializer
