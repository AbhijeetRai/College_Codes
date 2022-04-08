def fun(y,*x):
    print(y)
    for i in x:
        print(i,type(i),sep="=",end=" ")

fun(10,20) 
print("\n")
fun(10,20,30) 
print("\n")

fun(10)    
