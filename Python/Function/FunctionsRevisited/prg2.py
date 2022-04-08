def fun(a):
    print(a, type(a))

'''
I thought, if function returns multiple values and multiple returned values
are caught in one variable, then type of that one variable becomes tuple.

Similarly my assumption was multiple values can be sent to one parameter. 
But that does not happen.
'''
fun(10, 20)