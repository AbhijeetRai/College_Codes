from numpy import *

#everything was upcasted in str
a = array([10.5,22.1,22.5,27.3],str)
for i in a:
    print(i,type(i))

print()
#everything was casted into int and float value 5.5 becomes 5
a = array([1,2,3,4,5.5],int)
for i in a:
    print(i,type(i))

#everything was upcasted into float
print()
a = array([1,2,3,4,5.5],float)
for i in a:
    print(i,type(i))


'''
jaha tak cast karna possible hai, waha tak cast karega
'''
