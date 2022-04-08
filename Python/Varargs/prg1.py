def fun(x,*y):
    print('x is', x, type(x), end = "\t")
    print('y is', y, type(y))

fun(10,20)  # x = 10 y = (20,)
fun(10,20,30) #x = 10 y = (20,30)
fun(10)    #x = 10 y = ()
