class Bird:

    wings = 2 

    @classmethod        # this decorator will help method to accept by default cls
    def fly(cls):
        print(cls, cls.wings)

'''
Class methods are conventionally invoked using classname. 
But classmethods can also be invoked using instance
'''
Bird.fly()
Bird().fly()