arr = [[1, 2]] * 3
print(arr)
print(id(arr[0]))
print(id(arr[1]))
print(id(arr[2]))
arr[0][0] = 10
print(arr)

print('\n\n')

arr = [[j for j in range(1, 3)] for i in range(3)]
print(arr)
print(id(arr[0]))
print(id(arr[1]))
print(id(arr[2]))
arr[0][0] = 10
print(arr)
