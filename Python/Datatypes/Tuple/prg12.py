# we can write a tuple inside a list

ls = ["Abhijeet",(22,1999)]
print(type(ls))

#Attribute error int object has no attribute clear
#ls[1][1].clear()

#the class of ls[1] is tuple
print(type(ls[1]))

print(ls[1][1])

# we can select item from list and delete it, as list is mutable, that is same list object can be modified
#tuple as a whole is selected as 'item of list' and deleted
del ls[1]

print(ls)