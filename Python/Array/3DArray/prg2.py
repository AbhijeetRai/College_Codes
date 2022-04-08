from pprint import pprint
arr = []

arrays = int(input("Enter number of arrays\n"))

for i in range(arrays):

    temp = []
    print("Enter number of rows in array", i)
    rows = int(input())

    for j in range(rows):

        print("Enter row", j)
        temp.append([int(x) for x in input().split()])

    arr.append(temp)
print(arr, '\n\n')
pprint(arr)

'''
Can accomodate jagged array

[ [ [1, 2], [1, 2], [1, 2] ],                           array 0
 [ [1], [1, 2, 3], [2, 3], [4, 5, 6, 7] ],              array 1
 [ [4, 4], [4, 4] ] ]                                   array 2

'''
