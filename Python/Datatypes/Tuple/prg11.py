tuple = ('Abhijeet',22)
print(id(tuple),tuple)

# we cannot modify the existing tuple
#tuple[0] = "Abhijet Rai"

# if you still want to modify create a new one

tuple = ("Abhijeet Rai",22)
print(id(tuple),tuple)