
# Using double underscore in front of instance and static variable, 
# instance and static methods, makes it private.

class Lokmanya:

    __event = "Azadi"             # static or class variable

    def __showName(self):         # instance method
        print('Tilak') 

    def __showNative():           # static method
        print('Pune')       

class Gandhi(Lokmanya):
    pass

# print(Gandhi.__event)
# print(Gandhi().__event)

# Gandhi().__showName()
Gandhi.__showNative()