'''
    max(iterable, *[, default=obj, key=func]) -> value
    max(arg1, arg2, *args, *[, key=func]) -> value
    
    With a single iterable argument, return its biggest item. The
    default keyword-only argument specifies an object to return if
    the provided iterable is empty.
    With two or more arguments, return the largest argument.
'''
#print(max(1))		#Int object is not iterable

print(max(10, 440.198, 30.1, 440.199 ,11, 2))
#print(max(10, 440.198, 30.1, 440.199 ,11, 2, 'Abhi'))						# > not supported between instances of str and float 

print(max([10, 20], [10, 20, 30]))
#print(max([10, 20], [10, 20, 30], {1, 2}))									# > not supported between intances of set and list

print(max([10, 20], [10, 20, '30']))										# Here error was not given '30' was not lexicographically ever reached
#print(max([10, 20], [10, '20', 30]))										# Here error was given < not supported between instance of str and int