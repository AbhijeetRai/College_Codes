def maxVal() :

    val1,val2 = [int(x) for x in input('Enter two integer values').split()]
    if val1 >= val2:
        return val1
    else :
        return val2

a = maxVal()
print(a)
