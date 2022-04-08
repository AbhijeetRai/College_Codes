start,end = [int(x) for x in input('enter start and end values\n').split()]

for x in range(start,end+1):
    if (x % 5 == 0 and x % 3 == 0):
        continue
    else:
        print(x,end=" ")
