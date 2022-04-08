from numpy import array

a = array([1,2,3,4,5])
print(a)

for i in a:
    print(i,end=" ")
print()

rang = len(a)
print("Length is",rang)

for i in range(rang):
    print(a[i],sep=":",end=" ")
print()

#slicing is supported
print(a[1:3])
