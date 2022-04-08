def fun(x=5,y=10):
    print('x is',x)
    print('y is',y)

'''
Error
IF we dont set defalut value of x and call fun()
fun() missing 1 required positional argument x
'''


fun()

print()

fun(1)

print()

fun(0,2)