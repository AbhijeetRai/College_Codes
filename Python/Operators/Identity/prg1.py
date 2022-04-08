a = 10
b = 10

#memory management of python is such that it  will make only one object if values are same

print(id(a))
print(id(b))

b = 20

print(a,id(a))
print(b,id(b))
