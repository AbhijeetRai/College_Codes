def give_me_five():

    return[10,20,30]

'''
Error - Not enough values to unpack,
expected 4 got 3
a,b,c,d = give_me_five()
'''

'''
Too many values to unpack
Expected 2
a,b = give_me_five()
'''

a,b,c = give_me_five()
print(a,type(a))
print(b,type(b))
print(c,type(c))

print()

a = give_me_five()
#list remains list itself
print(a,type(a))
