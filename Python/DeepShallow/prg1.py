import copy as cp

list1 = [1, 2, 3, 4]
list2 = cp.deepcopy(list1)

list2[0] = 5

print(list1)
print(list2)
