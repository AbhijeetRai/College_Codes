'''
is - true if, two operands are identical
is not - true if, operands are not identical
'''

a1 = 3
b1 = 3

if id(a1) == id (b1) :
    print("identical")

print(a1 is b1)
print(b1 is a1)

z = a1 is b1
print(z,type(z))
