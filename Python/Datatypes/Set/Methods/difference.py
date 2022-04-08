a = {1, 3, 5, 7}
b = a.difference({9, 11, 7, 3}, [5, 7], "Abhi")
print(a, type(a))
print(b, type(b))

print()

a = {1, 3, 5, 7}
b = a.difference_update({9, 11, 7, 3}, [5, 7], "Abhi")
print(a, type(a))
print(b, type(b))


a = {1, 3, 5, 7}
#b = a.difference({9, 11, 7, 3}, [5, 7], "Abhi", 1.1)   #Give only iterable
#b = a.difference_update({9, 11, 7, 3}, [5, 7], "Abhi", 6)   #give only iterable
