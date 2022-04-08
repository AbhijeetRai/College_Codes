class Dog:

    name = "Coffee"
    age = 2 

    def __init__(self, p_name, p_age):

        name = "Spike"
        age = 10

        print(name, age)
        print(p_name, p_age)
        print(self.name, self.age)

        name = "Sheru"
        age = 1

        p_name = "Moti"
        p_age = 2 

        self.name = "Baga"
        self.age = 3

        print(name, age)
        print(p_name, p_age)
        print(self.name, self.age)

d1 = Dog("Maddy", 11)