'''
Sorts the list in place, like bubble sort, internal data structure is changed.
returns nothing
'''
ls1 = [1, 9, 3, 5, 7]
ls2 = ls1.sort()
print(ls1, type(ls1))
print(ls2, type(ls2))


'''
returns the sorted iterable, original iterable is not changed
'''
ls1 = [1, 9, 3, 5, 7]
ls2 = sorted(ls1)
print(ls1, type(ls1))
print(ls2, type(ls2))
