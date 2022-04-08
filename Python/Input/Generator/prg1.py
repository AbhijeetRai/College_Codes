# taking input and simply splitting it, gives us a list

a = input("Enter multiple values\n").split()
print('a is', a)
print('and type of a is', type(a))

print()

# we actually need an iterable(tuple here) inside list comprehension, generally when we use for loop
list1 = [int(x) for x in ('1', '2', 3)]
print(list1)

print()

# As said in comment on line 1, taking input and splitting it, gives us a list
# once we have a list, we iterate one by one elements of list and cast them into integer
list1 = [int(x) for x in input("Enter values\n").split()]
print(list1)
