from numpy import *

a = array([1,2,3])
for i in a:
    print(i,type(i))

print()

a = array(["Abhijeet","Divya","Sujay"])
for i in a:
    print(i,type(i))

print()

#every element will be upcasted to float to have similar data type
a = array([1,2,3.1])
for i in a:
    print(i,type(i))

print()

#everything will be upcasted to string to have similar datatype
a = array(["Abhijeet",2.1,2])
for i in a:
    print(i,type(i))
