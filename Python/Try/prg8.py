arr = [[0] * 3] * 2
print(arr)
print(id(arr[0]))
print(id(arr[1]))
arr[0][1] = 10
print(arr)

print('\n\n')

arr = [[0, 0, 0], [0, 0, 0]]
print(arr)
print(id(arr[0]))
print(id(arr[1]))
arr[0][1] = 10
print(arr)
