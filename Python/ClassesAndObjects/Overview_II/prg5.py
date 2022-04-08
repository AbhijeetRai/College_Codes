class Dog:

    c_name = "Coffee"
    c_age = 10

    def __init__(self, name, age):
        self.name = name
        self.age = age

        print(self.name, self.age) 

    
    def display(self):
        print(self.name, self.age) 


d1 = Dog(input("Enter name\n"), input("Enter age\n"))
d1.display()