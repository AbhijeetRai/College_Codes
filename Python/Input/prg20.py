# you can enter any number of values from 0 to n where there is only one variable to catch in list comprehension

x = [int(x) for x in input('enter multiple values\n').split()]
print(x,type(x))
print(type(x[0]))

#entering multiple values, it will convert into string at run time
x = input('Enter multiple values\n')
print(x,type(x))


#entering multiple values, it will convert into list at run time
x = input('Enter multiple values\n').split()
print(x,type(x))
print(type(x[0]))
