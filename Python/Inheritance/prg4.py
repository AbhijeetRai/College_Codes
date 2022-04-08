class Lokamanya:

    def __init__(self):
        self.event = "Freedom Struggle"

class Gandhi(Lokamanya):

    def __init__(self):         # When we do not write constructor of any class, it is written implicitly. 
        #super().__init__()     # And Parent's constructor is called implicitly. So when we write a constructor ourselves,
        pass                    # we must also call parent's constructor, 
                                # for parent's instance variable to initialised and inherited by child

    def fun(self):
        print(self.event)       # Because if Parent's constructor is not called, it's instance variable won't be initialised
                                # and would not be inherited
g1 = Gandhi()
g1.fun()