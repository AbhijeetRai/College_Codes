from array import *

a = array('i',[1,2,3,1,2,5])


#returns the index of first occurance of object
print('Index of first occurance of 2 is',a.index(2))
print('Index of first occurance of 1 is',a.index(1))

#reverse method returns nothing but will reverse the array
print(a.reverse())

for i in a:
    print(i,end="  ")
print()
