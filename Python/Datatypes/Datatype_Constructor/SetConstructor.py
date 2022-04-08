'''
set() -> new empty set object
set(iterable) -> new set object
'''

#ls = set(1, 2) 	# atmost one argument to be given
#ls = set(1)		# object passed must be iterable


from array import *
a = array('d', [1.1, 2.2, 3.3])
ls = set(a)					    #array is iterable
print(ls)


ls = set("C2W")			#string is iterable
print(ls)


ls = set([11, 22, 33])			#list is iterable
print(ls)


ls = set({1, 25, 36})
print(ls)						#set is iterable


ls = set((4, 6, 8))			#tuple is iterable
print(ls)


ls = set({7 : "MSD", 10 : "Sachin"})	#only key is iterated in dictionary
print(ls)
