from numpy import zeros 

a = zeros([2, 3, 4], dtype = int)
print(a)

print('\n\n\n')

a = zeros((2, 2, 2))
print(a)

print('\n\n\n')

a = zeros(6)
print(a, type(a))
a = a.reshape(2, 3, 1)
print(a)