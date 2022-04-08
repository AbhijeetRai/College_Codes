from array import *

dict1 = dict()

dict1[7] = "MSD"
dict1[10] = "Sachin"
dict1[0] = "Sehwag"

print(dict1)

a = array('i',dict1)
print(a)

for i in a:
    print(i,dict1[i],sep=":",end=" ")
print()

for i in range(len(a)):
    print(a[i],end=" ")
print()
