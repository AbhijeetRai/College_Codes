from array import *


a = array('i',[10,20,30,40,50,30])

#count - return number of occurances of an object

print('count of 50 is',a.count(50),'\ncount of 30 is',a.count(30))

#by default last element is removed
a.pop()

for i in a:
    print(i,end=" ")
print()
