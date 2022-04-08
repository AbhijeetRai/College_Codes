def fun(*args):
    print(args)
    print()

fun(1,2,3,{7:"MSD",10:"Tendulkar"})
fun({7:"MSD",10:"Tendulkar"})

fun((1,2,3))
fun((1,2,3),1)

fun(1,2,3,'a',3.5,[1,2,3],(1,2,3),{2,3,4},{7:"msd",10:"Sachin"})
