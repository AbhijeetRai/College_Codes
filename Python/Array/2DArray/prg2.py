
arr = []
size = int(input("Enter number of rows\n"))

#Can accomodate jagged array
#Input 1
for i in range(size) :
    print('Enter row', i)
    arr.append([int(x) for x in input().split()])
print()

#Output 1
for i in arr:
    print(i)
print('\n\n\n')





arr = []
size = int(input("Enter size\n"))

#Can accomodate jagged array
#Input 2
for i in range(size):
    arr.append([str(x) for x in input("Enter row\n").split()])

#Output 2
for i in arr :
    print(i)
print('\n\n\n')




arr = []
size = int(input('Enter size of rows\n'))

#Can accomodate jagged array
#Input 3
for i in range(size) :
    arr.append(input().split())

#Output 3
for i in arr :
    print(i)
