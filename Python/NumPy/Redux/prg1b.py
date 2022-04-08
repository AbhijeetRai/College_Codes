import array as arr
import numpy as np

#a = arr.array('i', [1, 2], [3, 4])
#a = arr.array('i', ([1, 2], [3, 4]))

#a = np.array([1, 2], [3, 4])

'''Bind the iterable in another iterable
That will be okay for numpy'''

a = np.array(([1, 2], [3,4]))
print(a)

a = np.array({(1, 2), (3, 4)})
print(a)

a = np.array(({7 : "MSD", 10 : "Sachin"}, {10 : "Messi", 7 : "CR7"}))
print(a)

a = np.array([{7 : "MSD"}, {10 : "Sachin"}])
print(a)
