class Dog:

    def __init__(self):
        self.name = "Coffee"
        self.age = 12

        #cannot directly use name, unless it is local variable or parameter
        print(self.name)
        print(self.age)

    
    def display(self):

        #cannot directly use onlty name, to print some value or access some value, unless it is local variable or parameter
        print(self.name)
        print(self.age)



d1 = Dog()
d1.display()