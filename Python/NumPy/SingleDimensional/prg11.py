'''
We can call array function of numpy module to create an array. When we create an array, we can specify data type
of elements as int,float,str etc
Second element also pronounced as data-type
'''

from numpy import *

a = array(["Shashi","Ashish","Kanha"],str)
for i in a:
    print(i,type(i))

print()

#10 will be upcasted in str
a = array(["Shasi","Ashish",10],str)
for i in a:
    print(i,type(i))
