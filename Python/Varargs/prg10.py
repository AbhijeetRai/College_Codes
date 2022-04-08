def fun(**args):
    for i in args:
        #if we print i only keys will be printed
        print(i,args[i])


fun(a=10,b=20)
print()
'''
Error
fun(7 = "MSD",10="Sachin")
    ^ keyword can't be an expression
'''

jerd = 7
jers = 10
fun(jerd = "MSD",jers="Sachin")
