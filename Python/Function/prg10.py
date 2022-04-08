def twoRet(x,y):
    return x+1,y+1

val1,val2 = [int(x) for x in input('enter two int values').split()]
ans1,ans2 = twoRet(val1,val2)
print(ans1,ans2,type(ans1),type(ans2))

'''
when multiple variables are returned and they are caught in one variable,
the one variable which catches multiple returned variables, is of type "TUPLE"
'''
val = twoRet(val1,val2)
print(val,type(val))
