dic = {1:"Shashi",2:"Rahul",3:"Ashish"}

from numpy import array

a = array(dic);
print(a )

#error - iteration over a 0-d array
for i in a:
    print(i)
