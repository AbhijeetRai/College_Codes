age = 21
year = 21

College = "Abhijeet"
Ghar = "Abhijeet"

print(age is year)
print(College is Ghar)


abhijeet = ["SITS","IT",3]
sujay = ["SITS","IT",3]
#answer is false because, whenver we are talking about two or more collection of objects,
#even if collection contains, the same objects. Addrresses of collections are different
print(abhijeet is sujay)

print(id(abhijeet))
print(id(sujay))
