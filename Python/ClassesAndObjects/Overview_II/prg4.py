class Dog:

    def __init__(self, name, age):
        self.name = name
        self.age = age

        print(self.name)
        print(self.age)

    
    def display(self):
        print(self.name)
        print(self.age)

d1 = Dog(input("Enter name\n"), input("Enter age\n"))
d1.display()