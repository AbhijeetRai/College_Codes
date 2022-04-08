'''
In deep copy, address of common list is different
In shallow copy, address of common list is same
'''

from copy import deepcopy

digit = [[1, 2], "Two", 3]
clone = deepcopy(digit)

for i in range(len(digit)) :
    print(id(digit[i]), id(clone[i]))




print("\n\n\n")




from copy import copy

digit = [[1, 2], "Two", 3]
clone = copy(digit)

for i in range(len(digit)) :
    print(id(digit[i]), id(clone[i]))
