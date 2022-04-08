x,y = input('Please enter two integer values\n').split()
print(x,type(x))
print(y,type(y))

#taking multiple input using list comprehension


x,y = [int(x) for x in input('Please enter two integer values\n').split()]
print(x,type(x))
print(y,type(y))
