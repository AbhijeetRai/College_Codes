for i in range(3):
	for j in range(3):

		print ("*",end="\t\t") if ( (i + j) % 2 == 0 ) else print("=",end="\t\t") 
	print()