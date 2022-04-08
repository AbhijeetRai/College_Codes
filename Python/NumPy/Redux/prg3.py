import numpy as np

ls = [1, 2, 3]
st = {1, 2, 3}
tp = (4, 5, 6)
dc = {7 : "MSD", 10 : "Sachin"}

a = np.array(ls)
print(a)

a = np.array(st)
print(a)

a = np.array(tp)
print(a)

a = np.array(dc)
print(a)

from array import array
print(array('i', dc))
