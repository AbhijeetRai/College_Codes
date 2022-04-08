'''
Help on built-in function sorted in module builtins:

sorted(iterable, /, *, key=None, reverse=False)
    Return a new list containing all items from the iterable in ascending order.

    A custom key function can be supplied to customize the sort order, and the
    reverse flag can be set to request the result in descending order.
'''

print(sorted(['Sujay', 'Divya', 'Wani', 'Tushar', 'Zagade']))
print(sorted({101, 11, 65, 371, 402, 220, }, reverse = True))         #has returned a list

# sort does not support dissimilar datatype

#print(sorted((1, 2, 3), key = len))    #Object of type int() has no len
print(sorted(('Divya', 'Sujay', 'Zagade', 'Tushar'), key = len))
print(sorted(('Divya', 'Sujay', 'Zagade', 'Tushar'), key = len, reverse = True))    #one inserted first, will be extracted first, even in reverse

print(sorted({12 : "Yuvraj", 10 : "Sachin", 48 : "Dada", 24 : "Raina", 7 : "Dhoni   "}))
