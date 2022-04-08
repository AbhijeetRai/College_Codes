'''
|  list() -> new empty list
|  list(iterable) -> new list initialized from iterable's items
'''

# ls = list(1, 2) 	# atmost one argument to be given
# ls = list(1)		# object passed must be iterable

from array import *
a = array('i', [1, 2, 3])		
ls = list(a)					#array is iterable
print(ls)


ls = list("Core2Web")			#string is iterable
print(ls)						


ls = list([1, 2, 3])			#list is iterable
print(ls)


ls = list({1, 2, 3})
print(ls)						#set is iterable


ls = list((4, 5, 6))			#tuple is iterable
print(ls) 						


ls = list({7 : "MSD", 10 : "Sachin"})	#only key is iterated in dictionary
print(ls)