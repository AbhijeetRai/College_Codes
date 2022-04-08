a = [1,2,3,4]
#unpacking the list a
val1, val2, val3, val4 = a 
print(val1, val2, val3, val4)

'''
va1, val2 = a 
ValueError: too many values to unpack
'''

'''
val1, val2, val3, val4, val5 = a
ValueError: not enough values to unpack
'''

#element on right is a list here, which is held in a, bind in a.
a = [int (x) for x in input("Enter int values\n").split()]
print(a,type(a))


#now instead of holding a list(on right side), we will unpack it immediately
val1, val2 = [int (x) for x in input("Enter two values of type int\n").split()]
print("\n",val1, val2, type(val1), type(val2))