friends = ['Divya', 'Sujay', 'Zagade', 'Adya', 'Sahil']

del(friends[0])
print(friends)

# friends is now ['Sujay', 'Zagade', 'Adya', 'Sahil'] 

# We can also pass sublist to delete with help of slice 
del(friends[0 : 2])
print(friends)

#entire list was taken as sublist and deleted
del(friends[:])
print(friends)