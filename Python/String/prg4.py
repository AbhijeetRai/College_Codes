dt = {"Captain" : "Virat Kolhi", "WicketKeeper" : "MS Dhoni", "Opener" : "Shikhar Dhawan"}
#if all the keys of a dictionary are strings, then all the keys will be joined
print(" ".join(dt))



dt = {"1" : "Sehwag", 7 : "MSD"}
#print("".join(dt))
'''
It joins the keys, but key at index 1 that is 7, is int instead of string, so we get error
sequence item 1: expected str instance, int found
'''

import numpy as np
a = np.array(['1', '2', '3'])
# strings of iterable(array) a will be joined
print(" ".join(a))


a = np.array([11, 22, 33])
# print("".join(a))
# error it expects str instance at index 0, but int is found


import array as arr
a = arr.array('u', ['A', 'b', 'h', 'i'])
#strings of an iterable will be joined
print(" ".join(a))


a = arr.array('i', [1, 2, 3])
# print("".join(a))
# error sequence item 0: expected str instance, int found
# iterable should hold, strings
