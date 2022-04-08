# we can write a tuple inside a list

ls = ["Abhijeet",(22,1999)]
print(type(ls))

#the class of ls[1] is tuple
print(type(ls[1]))

print(ls[1][1])

#now we are selecting 'item of tuple' and trying to delete it
# thus error typerror - tuple object does not support item deletion
del ls[1][1]
