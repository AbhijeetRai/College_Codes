arr = [[[0,0], [0,0]], [[0,0], [0,0]]]
arr.insert(1, [[1, 1], [1, 1]])

for array in arr :
    for row in array :
        for column in row :
            print(column, end = " ")
        print()
    print('\n')


arr = [ [ [0, 0], [0, 0] ], [ [0, 0], [0, 0] ] ]
arr[0] = 1              #Updating an entire array
arr[1][0] = [1, 1]      #Updating a row
arr[1][1][0] = 10       #Updating a value
print(arr)
print('\n')

arr = [ [ [0, 0], [0, 0] ], [ [0, 0], [0, 0] ] ]
del(arr[0])     #Array deleted
del(arr[0][0])  #Row deleted
del(arr[0][0][0]) #Value deleted
print(arr)
print('\n')


arr = [ [ [1, 1], [1, 1] ], [ [2, 2], [2, 2] ] ]
print(arr[1:])
