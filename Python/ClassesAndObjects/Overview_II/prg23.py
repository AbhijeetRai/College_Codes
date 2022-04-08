class ICCTrophy:

    trophyWin = 3

    def __init__(self, name):
        self.name = name 

    def win(self):
        print(self.name)
        print(self.trophyWin)

    def change(self):
        ICCTrophy.trophyWin += 1 


obj1 = ICCTrophy("Virat")
obj1.win() 
obj1.change()
obj1.win()

obj2 = ICCTrophy("Dhoni")
obj2.win()