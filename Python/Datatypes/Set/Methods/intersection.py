a = {2, 4}
b = a.intersection([4, 6])
print(a, type(a))
print(b, type(b))

print()

a = {2, 4}
#a.intersection(1)   #Whatever given to intersection must be iterable.


a = {2, 4, 6, 8}
b = a.intersection([6, 8, 10], {8})
print(b)

print()

a = {2, 4, 6, 8}
b = a.intersection([6, 8, 10], {8}, "Abhi")
print(b)


print("\n\n")

a = {2, 3, 5, 7}
b = a.intersection_update({3, 5}, [7])
print(a, type(a))
print(b, type(b))

print()

a = {2, 3, 5, 7}
#b = a.intersection_update({3, 5}, [7], 1.1) #give only iterable items to intersection_update
