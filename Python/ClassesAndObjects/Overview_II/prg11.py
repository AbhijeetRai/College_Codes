class Dog:
    pass


d2 = Dog()
Dog.name = "Spike"
print(Dog.name, d2.name)


d1 = Dog() 
d1.name = "Coffee"
print(Dog.name, d1.name)


Dog.name = "Tucker"
print(d2.name, Dog.name)
