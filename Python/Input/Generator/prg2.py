
# As said in comment on line 1(in previous program 'prg1.py'), taking input and splitting it, gives us a list
# once we have a list, we iterate one by one elements of list and cast them into integer
list1 = [int(x) for x in input("Enter values\n").split()]
print(list1)

print()

# we can split the input to have a list, iterate one by one elements of achieved list and unpack it at the same time

a, b, c = [int(x) for x in input("Enter three integers\n").split()]
print(a)
print(b)
print(c)
