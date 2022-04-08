#fromlist() - append itmes from list

ls = [int(x) for x in input('Enter elements for the list\n').split()]

from array import *

#intialiser is optional
a = array('i')

#fromlist() - append items from list
a.fromlist(ls)

for i in a:
    print(i,end=" ")
print()
