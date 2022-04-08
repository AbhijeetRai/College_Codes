def fun(*x):
    print('X is',x, 'type of x is', type(x)) 

fun()
fun(10)
#can hold distinguished data type as well
fun(10,'Abhijeet',6.1,'R')
fun(10,20)
fun([1,2,3], (1,2,3), 'a', 1)
