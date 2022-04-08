def fun(*args, a):
    print('args is', args)
    print('a is', a)
    pass

'''
Error
Nothing will reach a
keep varargs at last in
fun(10,20,30)
'''

'''
fun([10,20,30],3)
Error
Nothing will reach a
keep varargs at last
fun(10,20,30)

'''

fun([10,20,30],a=1)
fun(a = 20)