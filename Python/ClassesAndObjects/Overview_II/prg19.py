class Player:

    trophyWin = 5 

    def __init__(self, pName, jerNo):
        print('like constructor')
        self.playerName = pName
        self.jerseyNo = jerNo

    def playerInfo(self):
        print('In method')
        print(self.playerName)
        print(self.jerseyNo)
        print(Player.trophyWin, self.trophyWin)


obj1 = Player("Virat", 18)
obj1.trophyWin = 6                          #obj1 gets new instance variable "trophyWin", instead of class variable "trophyWin" being accessed
obj1.playerInfo()

print('\n\n')

obj2 = Player("Dhoni", 7)
obj2.playerInfo()       #obj2 has no instance variable "tropyWin", so when self is used to access trophyWin on obj2, on line 14.
                        #"class variable trophyWin is accessed"