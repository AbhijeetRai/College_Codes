from array import *

dict1 = {2:'Suraj',3:'Abhijeet'}

a = array('d',dict1)
for i in a:
    print(i,dict1[i])


dict1 = {2.1:'Suraj',3.1:'Abhijeet'}

a = array('i',dict1)
for i in a:
    print(i,dict1[i])
