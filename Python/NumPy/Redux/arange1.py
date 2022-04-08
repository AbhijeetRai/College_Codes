from numpy import arange

'''
arange(start, stop, update)
By default step is taken
arange([start,] stop[, step,], dtype=None)
'''

a = arange(5)
print(a)

a = arange(1, 6,)
print(a)

a = arange(3, 9, 2)
print(a)

a = arange(3, 0, -1)
print(a)

a = arange(10, 1, 1)
print(a)
