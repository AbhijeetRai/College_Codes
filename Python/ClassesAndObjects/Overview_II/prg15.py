class Dog:
    name = "Spike"

    def display(self):
        self.name = "Eziekal"
        print(self.name, Dog.name)

d1 = Dog()
d1.display()

d2 = Dog()
d2.display()
