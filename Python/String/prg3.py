#join method in string

st = {'R', 'A', 'J', 'U'}
print("".join(st))

st = ['R', 'A', 'J', 'U']
print("-".join(st))

tp = ('R', 'A', 'J', 'U')
print(" kati_lulli ".join(tp))

# error - join takes exactly one argument, four given
# print("*".join('A', 'B', 'H', 'I'))



# join expects to join string elements of an iterable
ls = [1, 2, 3, 4]
# error - sequence item 0: expected str instance, int found
#it means to say, at index 0 itself, it got an int instead of str
#print("".join(ls))
