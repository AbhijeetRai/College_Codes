from array import *

a = array('i',(1,2,3,4))
print(type(a))
#returns array has not actually converted it into list, only returns
print(a.tolist())
print(type(a))

b = a.tolist()
print('b is',b,'type of b is',type(b))
print(type(a))

'''
array waisa hi rah gaya-array
bas ek alag list return ho gai
'''
