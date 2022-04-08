def fun(y, *x):
    print(y)
    for i in x:
        print(i,type(i),sep="=",end=" ")

fun(10,[20,30]) # y = 10, x = ([20,30],)

print("\n")

fun(10,[10,20,30],{1,2,3}) #y = 10 x = ([10,20,30],{1,2,3})

