import copy as cp

#1
list1 = [1, {2, 3}, {7 : "MSD", 10 : "Sachin"}]
list2 = cp.copy(list1)

for i in range(len(list1)):
    print(id(list1[i]), id(list2[i]))


print("\n\n\n")

#2
list1 = [1, {2, 3}, {7 : "MSD", 10 : "Sachin"}]
list2 = cp.deepcopy(list1)

for i in range(len(list1)):
    print(id(list1[i]), id(list2[i]))
