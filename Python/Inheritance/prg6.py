class Lokmanya:

    #We can make a variable private by adding two underscores before it and it would not be inherited
    def __init__(self):
        self.__event = "Freedom Struggle..."

class Gandhi(Lokmanya):
    pass 

g1 = Gandhi() 
print(g1.__event)