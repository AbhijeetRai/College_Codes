def outer():

    a = 10
    def inner():
        b = 10
        print(a)

    print(b)
    inner()

outer()

'''
Nested function can access the content of outer function, but not vice versa.
'''
