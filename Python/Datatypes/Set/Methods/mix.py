a = {1, 2}
print(a.issubset([1, 2, 3]))
print(a.issubset((1, 2)))
print(a.issubset({1: "Rahul", 2 : "Sachin"})) #match only keys
#print(a.issuperset(1)) #give only iterable

print()

b = {1, 2, 3, 6}
print(b.issuperset(a))
print(b.issuperset([3, 5]))
print(b.issuperset((3, 6)))
#print(b.issuperset(2)) #give only iterable

print()

c = {1, 2, 3} #prime numbers
#print(c.isdisjoint((4))) #give only iterable
print(c.isdisjoint((4, )))
print(c.isdisjoint((4, 3)))


#c.issubset((1, 2), {3}) #Takes only one argument
#c.issuperset((1, 2), {3})   #Takes only one argument
c.issubset({1}, {2})    #Takes only one argument
