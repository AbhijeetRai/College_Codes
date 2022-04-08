#creating one array from another


ls = ['a','b','h','i']
from array import *
a = array('u',ls)

#optinal intialiser should be iterable
#array a is also iterable
b = array('u',a)

for i in b :
    print(i)
