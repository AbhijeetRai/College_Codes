import copy as cp

set1 = {1, 2, 3, 4}
set2 = cp.copy(set1)

set2.add(5)

print(set1)
print(set2)

dict1 = {7: "MSD", 10 : "Sachin"}
dict2 = cp.copy(dict1)

del(dict2[10])

print(dict1)
print(dict2)

list1 = [1, 2, 3, 4]
list2 = cp.copy(list1)

list2.append([5, 6])

print(list1)
print(list2)
