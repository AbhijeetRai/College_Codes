""" 
? Class Variable, (say) player will be accessible on object,
if there is no such instance variable  
"""

class AllRounder:

    player = "Andrew Flintoff"

athelte1 = AllRounder()
print(athelte1.player)

athelte2 = AllRounder()
print(athelte2.player) 


AllRounder.player = "Styris Scott"
print(athelte1.player)
print(athelte2.player) 
