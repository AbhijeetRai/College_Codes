list = []

list.append("Shashi")
list.append(10)
list.append(10.5)
list.append("Rahul")

print(list)

list[0].clear()

# error on line 10 because, a string is fetched 
# and it has no such method as clear

# we can use string method here