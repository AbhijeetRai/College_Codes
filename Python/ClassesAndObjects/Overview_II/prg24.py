class City:

    name = "London"

    def __init__(self, name):
        self.name = name

    def display(self):
        print(City.name, self.name)


c1 = City("Paris") 
c1.display() 

c2 = City("Normandy")
c2.display()