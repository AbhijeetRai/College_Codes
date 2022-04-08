class City:

    name = "Paris"
    river = "on Seine"

    # instance paris accepted as self
    def display(self):
        # interpreter is not able to access variable name and variable river
        # without variable 'self' here.
        print(self.name, self.river)


paris = City()
# instance paris sent to display
paris.display()
