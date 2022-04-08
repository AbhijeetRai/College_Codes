'''
|  index(...)
|      L.index(value, [start, [stop]]) -> integer -- return first index of value.
|      Raises ValueError if the value is not present.
'''

apps = ["InstaGram", "Facebook", "WhatsApp", "Chrome", "Wynk", "PicsArt", "WaterMark", "InstaGram"]

print(apps.index("InstaGram"))
#print(apps.index("InstaGram", 1, 5)) #ValueError Not in the list

print()

#start is inclusive
print(apps.index("InstaGram", 0))
print(apps.index("InstaGram", 0, 9))

print()

#Stop is not inclusive
#print(apps.index("InstaGram", 1, 7))   #ValueError Not in the list
print(apps.index("InstaGram", 1, 8))
