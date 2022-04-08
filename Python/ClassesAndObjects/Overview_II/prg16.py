class Dog:

    name = "Coffee"
    age = 10

    def __init__(self):

        name = "Tucker"
        age = 3

        self.name = "Spike"
        self.age = 5

        print(name, age)
        print(self.name, self.age)
        print(Dog.name, Dog.age)  

Dog()