class Dog:
    name = "Spike"

    def display(self):
        print(self.name)

print(Dog.name)

d1 = Dog() 
d1.name = "Coffee"

d2 = Dog()
print(d2.name)

Dog.name = "Tucker"
print(d2.name)


d1.display()
d2.display()
print(Dog.name)