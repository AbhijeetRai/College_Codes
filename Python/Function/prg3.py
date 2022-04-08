def addrange():
    sum = 0
    low,high = [int(x) for x in input('Put lower and upper values\n').split()]
    for i in range(low,high+1):
        sum += i
    print(sum)

addrange()
addrange()
