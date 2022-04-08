var1 = 10
def fun():
    #global variable var1 will be read or accessed in fun()
    print('var1 is',var1)

fun()


var1 = 10
def fun():
    #new local variable var1 will be intialised in local scope of fun()
    var1 = 20
    print('var1 is',var1)
    print('var1 is at',id(var1))

fun()
print('var1 is',var1)
print('var1 is at',id(var1))


var1 = 10
def fun():
    #cannot find value for var1 before assignment
    #var1 = var1 + 20
    print('var1 is',var1)

fun()


var1 = 10
def fun():
    #tell python explicitly do not intialise a new variable
    #instead access var1 which has global scope
    global var1
    var1 = var1 + 20
    print('var1 is',var1)

fun()
