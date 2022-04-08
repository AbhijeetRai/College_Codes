# we can write a tuple inside a list

ls = ["Abhijeet",(22,1999)]
print(type(ls))

print(ls[1][1])

#now we cannot modify item of a tuple
ls[1][1] = 1999
