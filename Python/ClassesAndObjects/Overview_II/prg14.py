class Dog:
    name = "Spike"

    def display(self):
        print(self.name, Dog.name)

d1 = Dog()
d1.name = "Tucker"
d1.display()

d2 = Dog()
d2.name = "Esabel"
d2.display()
