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

'''
Neither of the objects have instance variable trophyWin, but when self is used to access trohyWin in playerInfo() method.
Class variable trophyWin is accessed
'''

obj1 = Player("Virat", 18)
Player.trophyWin = 6            #class variable trophyWin is accessed
obj1.playerInfo()

print('\n\n')

obj2 = Player("Dhoni", 7)
obj2.playerInfo()