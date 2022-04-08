def fun(a, b, c, d, e):
    print(a, b, c, d, e)

'''
fun()
TypeError : fun() missing 5 required positional arguments: 'a', 'b', 'c', 'd', 'e'

fun(c = 10)
TypeError : fun() missing 4 required positional arguments: 'a', 'b', 'd' and 'e'
'''

def gun(a, b = 20, c = 30): #a is compulsory, rest are optional
    print(a, b, c)

gun(10)
gun(a = 10)
gun(10, b = 50)
#gun(c = 100) gun() missing 1 required positional argument 'a'
gun(10, c = 100)
gun(0, 15)
#gun() #gun() missing 1 required positional argument 'a'
