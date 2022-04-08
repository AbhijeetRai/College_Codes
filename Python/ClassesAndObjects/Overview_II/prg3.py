class Dog:

    def __init__(self):                         
        self.name = "Coffee"                    # note this is Instance variable
        self.age = 12                           

    
    def display(self):
        print(self.name)
        print(self.age)



d1 = Dog()
d1.display()