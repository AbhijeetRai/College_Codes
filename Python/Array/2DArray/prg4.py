arr = [[1, 2, 3], [7, 8, 9]]
arr.insert(1, [4, 5, 6])                        #Insert

for ls in arr:
    for num in ls:
        print(num, end = " ")
    print()
print('\n\n')



arr = [[1, 2, 3], [7, 8, 9]]
arr[0][2] = 30                                  #Update
arr[1] = [2, 3]                                 #Update
print(arr)
print('\n\n\n')



arr = [[1, 2], [3, 4], [5, 6]]
del(arr[0])                                     #Delete
del[arr[1][0]]                                  #Delete
print(arr)
print('\n\n\n')


arr = [[1, 2], [3, 4], [5, 6]]
print(arr[ 0: 2])                               #Slicing
