from numpy import ones 

a = ones(5)
print(a)

print()

a = ones(4, dtype = int)
print(a)

print()

a = ones((2, 2))
print(a)

print()

a = ones([3, 3], dtype = int)
print(a)

print()

a = ones(4)
a = a.reshape(2, 2)
print(a)