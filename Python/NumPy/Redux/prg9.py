'''
Numpy multidimensional arrays are printed in more sophisticated way than normal multi-dimensional arrays (nested lists)
'''

ls2 = [[1, 2], [3, 4]]
ls3 = [ [ [1, 2], [3, 4] ], [ [5, 6], [7, 8] ] ]
print(ls2)
print(ls3)

print()

from numpy import array

arr1 = array([[1, 2], [3, 4]])
arr2 = array([ [ [1, 2], [3, 4] ], [ [5, 6], [7, 8] ] ])

print('arr 1 is')
print(arr1)

print('\n\n')

print('arr 2 is')
print(arr2)