'''
any(iterable, /)
    Return True if bool(x) is True for any x in the iterable.

    If the iterable is empty, return False.

all(iterable, /)
    Return True if bool(x) is True for all values x in the iterable.

    If the iterable is empty, return True


Any 'or' jaise kam karta hai, usko intzar hai ki ek to bhi true mile.
Agar iterable khali rah gaya, aur use true nahi mila to wo false return kar dega.

All kam karta hai 'and' jaise, agar 'and' ko bhi false nahi mila, iterable khali rah gaya, to wo
true return kar dega
'''



#print(any(1)) 						#Give only iterable value to any
#print(all(1.1))					#Give only iterable value to all

print(all([1, 2, 3]))				#For all, all the elements must be true
print(all([1, 2, 3, 0]))			#All the elements must be true
print(all({0}))
print(all((1, 2	)))
print(all({0 : "MSD", 10 : "Sachin"}))
print(all('Abhi'))

from array import array
a = array('i', [0, 2, 6])
print(all(a))

print('\n-----------------------------------\n')

print(any([1, 2, 3]))				#if in any, any of value is true, result is true, else false
print(any([0, 0, 0, 0]))
print(any({0}))
print(any((1, 2	)))
print(any({0 : "MSD", 10 : "Sachin"}))
print(any('Abhi'))

from array import array
a = array('i', [0, 2, 6])
print(any(a))
