#Ways to import something from a module

import numpy
arr = numpy.array([1, 2])
print(arr)


import numpy as np
arr = np.array([3, 4])
print(arr)


from numpy import *
arr = array([5, 6])
print(arr)


from numpy import array
arr = array([7, 8])
print(arr)

from numpy import array as arey
arr = arey([9, 10])
print(arr)

# Even this works
# from copy import copy, deepcopy
# from copy import copy as sc, deepcopy as dc
# import os, emoji
# import os as o, emoji as e

