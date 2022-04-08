'''
Cannot accomodate jagged array
'''
arr = []
arrays, rows, columns = [int(x) for x in input("Enter number of arrays, rows and columns\n").split()]

for i in range(arrays) :

    temparr = []

    for j in range(rows):

        temprow = []

        for k in range(columns):
            print("Enter element at ", i, j, k)
            temprow.append(int(input()))

        temparr.append(temprow)

    arr.append(temparr)

print(arr)
