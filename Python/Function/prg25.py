def fibo(num):

    val1 = 0
    val2 = 1

    while(val1<=num):
        print(val1)
        sum = val1+val2
        val1=val2
        val2=sum

fibo(5)
