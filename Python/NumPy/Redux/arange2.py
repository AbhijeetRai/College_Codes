from numpy import arange, linspace

'''
arange([start,] stop[, step,], dtype=None)
'''

a = arange(1, 22, 4, dtype = int)
print(a)

a = arange(1, 22, 4, dtype = float)
print(a)

#a = arange(1, 22, 4, dtype = str) #error
#print(a)

a = arange(0.5, 10.4, 0.8)
print(a)

a = arange(0.5, 10.4, 0.8, dtype = int)
print(a)
