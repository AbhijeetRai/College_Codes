from numpy import zeros 

a = zeros(5)
print(a)

print()

a = zeros(4, dtype = int)
print(a)

print()

a = zeros((2, 2))
print(a)

print()

a = zeros([2, 2], dtype = int)
print(a)

print()

a = zeros(9, dtype = int)
print(a)
print(type(a))
a = a.reshape(3, 3)
print(a)
print(type(a))