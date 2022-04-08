def fun(*args,**krgs):
    print('args is',args, type(args))
    print('krgs is',krgs, type(krgs))
    print()

ls = [1,2,3]
dic = {7:"MSD",10:"Sachin"}

fun(ls,dic)
fun(10,20,30, b = 50, a = 80)
fun([10,20,30],b=50)
fun([10,20,30],10)
