from numpy import array

two = array([[1, 2, 3], [4, 5, 6], [1, 2]])

for i in two :
    for j in i :
        print(j, end = " ")
    print()

print()

print(len(two))
print(len(two[0]))
print(len(two[1]))
print(len(two[2]))

print()

for i in range(len(two)):
    for j in range(len(two[i])):
        print(two[i][j], end = " ")
    print()

print()

print(two)
