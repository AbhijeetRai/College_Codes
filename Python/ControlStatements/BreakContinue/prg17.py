for i in range(1,6):
    for j in range(i):
        print(i,end="   ") if i % 2 != 0 else print("*",end="   ")
    print()
