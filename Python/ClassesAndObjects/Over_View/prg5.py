class City :

    name = "Bern"
    country = "of Switzerland"

    #Using self keyword becomes mandatory to access variables
    def __init__(self):
        print(self.name, self.country)

City()
