clone = dict.fromkeys({1,2,3})
print(clone)

clone = dict.fromkeys((1,1))
print(clone)

#clone = dict.fromkeys([[1, 2], 2]) #Unhashable type -list, in dictionary key must be immutable

clone = dict.fromkeys({7 : "MSD", 10 : "Sachin"})
print(clone)

clone = dict.fromkeys([1, 2, 3], "digit")
print(clone)

clone = dict.fromkeys({7 : "CR", 10 : "MESSI"}, 'Football')
print(clone)

#Even string is an iterable
