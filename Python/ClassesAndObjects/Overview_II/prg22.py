"""
? Instance variable player will not be accessed by class or any other instance.
! If it belongs to only one instance 
"""

class AllRounder:
    
    def __init__(self):
        print('In constructor')

athlete1 = AllRounder()
athlete1.player = "Albie Morkel"

print(athlete1.player)

athlete2 = AllRounder()
print(athlete2.player)
print(AllRounder.player)