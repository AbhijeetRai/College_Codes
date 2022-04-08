def fun(x,y=10):
    print('x is',x)
    print('y is',y)

fun(14,15)

print()

a = 1
b = 2
fun(a,b)

print()

x,y = [int(x) for x in input('Enter two values\n').split()]
fun(x,y)
print()

fun(10)
