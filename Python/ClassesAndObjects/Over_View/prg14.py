class Dog:

    def display(self, *info):
        print(info)

        breed, age = info
        print(breed)
        print(age)

        species =  info[0]
        life = info[1]

        print(species)
        print(life)

d = Dog()
d.display("Labrador", 2)
