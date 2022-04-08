def arithmetic(x,y):

    def add(x,y):
        print(x+y)
        a = 1

    def sub(x,y):
        print(x-y)

    def div(x,y):
        print(x/y)

    def mul(x,y):
        print(x*y)

    #add() add() missing 2 required positional arguments 'x' and 'y'
    #print(a) name 'a' is not defined
    add(x,y),sub(x,y),mul(x,y),div(x,y)
    
arithmetic(1,2)
