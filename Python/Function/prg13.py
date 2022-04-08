def fun(x,y):
    print('x is',x)
    print('y is',y)

fun(14,15)

print()

a = 1
b = 2
fun(a,b)

print()

c,d = [int(x) for x in input('Enter two integers\n').split()]
fun(c,d)

'''
Error
TypeError : fun() missing 1 required positional argument: 'y'
'''
fun(10)

'''
Supppose a function has two parameters and we pass only one argument, 
this leads to TypeError as shown on line 20
so we can set default value of parameter as shown in prg14.py
'''
