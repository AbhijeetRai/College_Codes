'''
This kind of multiplication does not work with set and dictionary
'''

s = 'Abhi' * 3
print(s, type(s))
print()

ls = [1, 2] * 3
print(ls, type(ls))
print()

tp = (1, 2) * 3
print(tp, type(tp))
print()

ls1 = [[1, 2] * 3] * 3
print(ls1, type(ls1))
print()

ls2 = [(1, 2) * 3] * 3
print(ls2, type(ls2))
print()

ls3 = [[1, 2]] * 3
print(ls3, type(ls3))
print()

ls4 = [(1, 2)] * 3
print(ls4, type(ls4))
print()

'''
When we are working with nested data structure, and outer data structure is tuple.
All the elements are unpacked. As if '()' parentheses of outer tuple does not exist in equation
'''
tp1 = ((1, 2) * 3) * 2
print(tp1, type(tp1))
print()

tp1 = (1, 2) * 3 * 2
print(tp1, type(tp1))
print()

tp2 = ([1, 2] * 3) * 2
print(tp2, type(tp2))
print()

tp2 = [1, 2] * 3 * 2
print(tp2, type(tp2))
