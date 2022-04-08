class City:

    name = "Paris"
    river = "Seine"

    def display(self):

        name = "Prague"
        river = "Vltava"

        print(name, river)
        print(self.name, self.river)


City().display()
