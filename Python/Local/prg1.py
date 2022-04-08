def fun(x,y):

    def inner():
        print(x,y)
        a=10

    return inner
    #a nai dikega print(a)

i = fun(33,44)
i()
