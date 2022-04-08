from numpy import array

a = array([1, 2, 3])
print(a)
print(type(a[0]))

print()

a = array([1, 2, 3], dtype = str)
print(a)
print(type(a[0]))

print()

a = array([[1, 2, 3], [4, 5, 6]])
print(a)
print(type(a[0]))
print(type(a[0][0]))

print()

a = array([[1, 2, 3], [4, 5, 6]], dtype = str)
print(a)
print(type(a[0]))
print(type(a[0][0]))
