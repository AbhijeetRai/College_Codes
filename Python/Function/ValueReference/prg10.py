

def fun(x):
    print(type(x))
    print(id(x))
    x = [10,20,30]
    print(id(x),id(x[0]))


ls = [10,20,30]
fun(ls)
print(id(ls),type(ls),id(ls[0]))

print()

a = 1
print(id(a))
a = 1
print(id(a))

print()

'''
two list will have different address even if content is same
address of same cotnent is same
'''
ls = [1,2,3]
print(id(ls),id(ls[0]),id(ls[1]),id(ls[2]))
ls = [1,2,3]
print(id(ls),id(ls[0]),id(ls[1]),id(ls[2]))
