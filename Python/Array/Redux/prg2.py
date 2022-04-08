from array import array

a = array('i', [1, 2, 3])
print(a, a[:2])

print()

a = array('i', {1, 2, 3})
print(a, a[:2])

print()

a = array('i', (1, 2, 3))
print(a, a[:2])

print()

a = array('i', {7 : "MSD", 10 : "Sachin"})
print(a, a[:3])