def fun(*args):
    for i in args:
        print(i)

fun(40,30)

'''
Error - fun got an unexpected keyword argument a
fun(a=100,b=200)
to give key value pair use **args
as shown in prg9.py
'''
