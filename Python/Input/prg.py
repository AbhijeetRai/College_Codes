
x,y = input('enter two values').split()
print(x,type(x))
print(y,type(y))

x,y = [int(i) for i in input('enter two values').split()]
print(x,type(x))
print(y,type(y))

ls = [int(i) for i in input('Enter multiple values').split()]
print(ls)

ls = input('enter multiple values')
print(ls,type(ls))

#list at runtime
ls = input('enter multiple values').split()
print(ls,type(ls))

print("\n")

ls = [str(x) for x in input('Enter multiple values').split()]
print(ls)

ls = [input('Enter multiple values')]
print(ls)

ls = [input('Enter multiple values').split()]
print(ls)
