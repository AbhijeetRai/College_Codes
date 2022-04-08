class Dog:

    c_name = "Coffee"
    c_age = 10

    def __init__(self):
        #cannot directly access c_name unless it is parameter or local variable
        print(self.c_name, Dog.c_name)
        pass

    def display(self, ):
        
        #cannot directly access c_name unless it is parameter or local variable
        print(self.c_name, Dog.c_name)


d1 = Dog()
d1.display()