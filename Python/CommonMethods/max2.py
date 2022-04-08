'''
    max(iterable, *[, default=obj, key=func]) -> value
    max(arg1, arg2, *args, *[, key=func]) -> value
    
    With a single iterable argument, return its biggest item. The
    default keyword-only argument specifies an object to return if
    the provided iterable is empty.
    With two or more arguments, return the largest argument.
'''

print(max([], default = 'Empty'))


print(max([111, 2, 3, 11,]))
#print(max([111, 2, 3, 11, 'A']))						# '>' not supported between instances of 'str' and 'int'

print(max([ (7, 10), (0, 10), (12, 24) ]))
#print(max([ (7, 10), (0, 10), (12, 24), 'A']))			# '>' not supported between instances of 'str and 'tuple'

print(max([(1, 2), (1, 2, '3')]))						#Error was not given because '3' was not lexicographically compared with 2
#print(max([(1, 2), (1, '2', 3)]))						# '>' not supported between instances of 'str' and 'int'