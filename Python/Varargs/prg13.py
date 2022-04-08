def fun(**args):
    print('in fun')
    print(args,type(args))

'''
TypeError : fun() takes 0 positional argument but 1 was given
fun(10)
'''

fun()

'''
TypeError - fun takes 0 positional argument but 3 were given
fun(10,203,0)
'''
