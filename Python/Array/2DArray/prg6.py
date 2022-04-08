from sys import exit

m1 = []
m2 = []

r1, c1 = [int (x) for x in input("Enter number of rows and columns in matrix 1\n").split()]
r2, c2 = [int (x) for x in input("Enter number of rows and columns in matrix 2\n").split()]

if c1 != r2 :
	print("Number of columns of matrix 1 and number of rows in matrix 2 must be same")
	exit(0)


print('\nEnter matrix 1')
for i in range(r1) :
	
	temp = []

	for j in range(c1) :
		
		print('Enter element at', i, j)
		temp.append(int(input()))

	m1.append(temp)


print('\nEnter matrix 2')
for i in range(r2) :
	
	temp = []

	for j in range(c2) :

		print('Enter element at', i, j)
		temp.append(int(input()))

	m2.append(temp)


print('\nmatrix 1 is')
for r in m1 :

	for c in r :
		
		print(c, end = " ")
	
	print()


print('\nmatrix 2 is')
for r in m2 :

	for c in r :

		print(c, end = " ")
	
	print()

m3 = []
for i in range(r1) :

	row = []

	for j in range(c2) :

		sum = 0

		for k in range(r2) :

			val = m1[i][k] * m2[k][j]
			sum = sum + val

		row.append(sum)

	m3.append(row)


print('\nResultant matrix 3 is')
for r in m3 :

	for c in r :
		
		print(c, end = " ")
	
	print()

