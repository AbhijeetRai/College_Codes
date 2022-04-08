def give_me_give():
    print('In give_me_give')
    return 12,15,50

give_me_give()

'''
Error - Too many values to unpack
a,b = give_me_give()
'''

'''
Error - Not enough values to unpack
a,b,c,d = give_me_give()
'''
print()
a,b,c = give_me_give()
print(a,type(a))
print(b,type(b))
print(c,type(c))


'''
When multiple values are caught in one variable, that one variable becomes "TUPLE"
'''
print()
a = give_me_give()
print(a,type(a))
