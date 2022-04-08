arr = []
row, column = [int(x) for x in input("Enter size of row and column\n").split()]

#Cannot accomodate jagged array
for i in range(row) :
    tempArr = []

    for j in range(column) :
        print('Enter element at postion', i, j)
        tempArr.append(int(input()))

    arr.append(tempArr)


for i in range(len(arr)) :
    for j in range(len(arr[i])) :
            print(arr[i][j], end = " ")
    print()
