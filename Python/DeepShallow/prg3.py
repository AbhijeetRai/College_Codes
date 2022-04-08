import copy as cp

list1 = [1, 2, [3, 4]]
list2 = cp.copy(list1)

for i in range(len(list1)) :
    print(id(list1[i]), id(list2[i]))
print("\n")

list2[2][1] = 5

print(list1)
print(list2)
