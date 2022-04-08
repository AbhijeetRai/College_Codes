import numpy as np

a = np.array([[1, 2, 3], [1, 2]])
#If array is jagged, list data type will be separately specified for each row
print(a)
print(type(a[0]))
print('\n')


a = np.array([[4, 5, 6], [7, 8]], dtype = object)
print(a)
print(type(a[0]))
print()

#Now data type will not be specified, as data type is numpy.ndarray
a = np.array([[1, 2, 3], [4, 5, 6]])
print(type(a[0]))
print(a)
