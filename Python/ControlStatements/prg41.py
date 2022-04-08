for i in range(1,6):
    for j in range(1,7-i):

        print("=",end=" ") if j % 2 == 0 else print("*",end=" ")
    print()
