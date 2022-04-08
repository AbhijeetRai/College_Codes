a = frozenset([1, 2, 5])
b = a.union({5, 7, 9}, [2, 11,], {7 : "MSD", 12 : "Ganguly"}, 'Abhi')
print(a, type(a))
print(b, type(b))

print()

a = frozenset([1, 2, 5])
b = a.intersection({5, 7, 9}, [2, 11,], {7 : "MSD", 12 : "Ganguly"}, 'Abhi')
print(a, type(a))
print(b, type(b))

print()

a = frozenset([1, 2, 5])
b = a.difference({5, 7, 9}, [2, 11,], {7 : "MSD", 12 : "Ganguly"}, 'Abhi')
print(a, type(a))
print(b, type(b))

print()

a = frozenset([1, 2, 5])
b = a.symmetric_difference([5, 7 ,9])		#Symmetric difference takes only one argument
print(a, type(a))	
print(b, type(b))