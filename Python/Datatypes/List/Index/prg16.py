ls = ["Rai",22,6.1]

print(ls)

a="Manikpur"

ls=["Rai",1999,a]

print(ls)


ls = ["Rai",1999,["Abhijeet",22,6.1],"Manikpur"]
print(ls)

print(ls[0],ls[-1]) #we can print two variables using comma
print(ls[2][1])
print(ls[2][0])
print(ls[2][0][0])
#print(ls[2][0][0][2])	



#Everything in Python is an object . 
#You have to understand that Python represents all its data as objects. 
#An object's mutability is determined by its type. 
#Some of these objects like lists and dictionaries are mutable 