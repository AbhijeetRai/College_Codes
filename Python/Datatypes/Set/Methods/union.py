a = {2, 4, 6}
b = a.union({8, 10})
print(a)
print(b)

print()

a = {2, 4, 6}
b = a.union([6, 8], (10 , 12), {14 : "Zaheer"}, "Even", {"Even", "Odd", 'E', 'v'})
print(b)

print()

a = {1, 3}
b = a.union({5, 6})
print(a, type(a))
print(b, type(b))

print()

a = {1, 3}
b = a.union([5, 7]).union((9, 11))  #This thing "a.union([5, 7])" returns a set(say temp), we perform union of temp
print(b)

'''
Update is union update
'''

print()

a = {5, 7}
#a.union(1) #Whatever argument given to union, must be iterable
