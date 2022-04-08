#Non Local variables are used in nested function
def fun():
    var1 = 10

    def gun():
        print(var1)
        var2 = var1 + 1
        print(var2)

    gun()
fun()



def fun():
    var1 = 10

    def gun():
        #nested function creates a new variables for itself
        var1 = 20
        print(var1,id(var1))

    print(var1,id(var1))
    gun()
fun()



def fun():
    var1 = 10

    def gun():
        #new variable var1 is created
        #var1 = var1+10
        print(var1)

    gun()
fun()


def fun():
    var1 = 10

    def gun():
        #tell python explicitly that it has to access outer var1
        nonlocal var1
        var1 = var1 + 10
        print(var1)

    gun()
    print(var1)
fun()
