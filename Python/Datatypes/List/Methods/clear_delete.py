ls = [1, 2, [3, 4, 5, 6], {7, 8}]

ls.clear()
print(ls)
#ls exists but is vacant now

ls = [1, 2, [3, 4, 5, 6], {7, 8}]
del ls[:]
print(ls)
#ls exists but is vacant now

'''
If we use del 'ls' or del 'any_object_variable_without_indexings/slicing'. That object itself no longer exists. 
'''
