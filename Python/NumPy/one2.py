from numpy import ones 

a = ones((2, 3, 1), dtype = str)
print(a)

print('\n\n\n')

a = ones([2, 3, 4])
print(a)

print('\n\n\n')

a = ones(27, dtype = int)
a = a.reshape(3, 3, 3)
print(a)