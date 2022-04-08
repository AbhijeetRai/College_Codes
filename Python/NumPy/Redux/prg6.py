cric = {7 : "MSD", 10 : "Sachin", 3 : "Raina"}
fball = {7 : "Ronaldo", 10 : "Messi"}

from numpy import array
a = array((cric, fball))
print(a)

print()

for i in a:
    for j in i :
        print(j, end = " ")
    print()

print()

print(len(a))
print(len(a[0]))
print(len(a[1]))

print()
print(a)
