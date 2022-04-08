class Lokmanya:

    # self will print the name of object, due to which it was called originally
    def showName(self):
        print(self)

class Gandhi(Lokmanya):
    pass  

g1 = Gandhi() 
g1.showName()

t1 = Lokmanya() 
t1.showName()