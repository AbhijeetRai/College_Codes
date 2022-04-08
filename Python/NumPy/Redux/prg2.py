import array as arr

a = arr.array('i', [1, 2])
a[0] = 10
print(a)                            #single dimensional built-in array is mutable

import numpy as np

numpy_Array = np.array([1, 2])
numpy_Array[0] = 10
print(numpy_Array)                  #numpy array is mutable too
