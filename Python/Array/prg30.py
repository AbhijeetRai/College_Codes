# Python program to take an array from user and search the key in array,(key is given by user)

from array import *

a = array('i',[int(x) for x in input('Enter the elements of array\n').split()])
key = int(input('Enter the key\n'))

flag = 0

for i in range(0,len(a),1):
    if(a[i]==key):
        flag=1
        break

print('key present at index',a.index(key)) if flag == 1 else print('Key not present')

print()

#''''''''' Second Logic '''''''''''

if(key in a) :
    print('Key presnet at',a.index(key))
else :
    print('key not present')
