'''
For me any comprehension whether list or Dictionary is made of three things

expression iterable condition

where expression and iterable are compulsory and condition is optional

For example, in
ls = [ord(x) for x in ['A', 'B', 'C'] if x == 'A']
ord(x) is expression
for x in ['A', 'B', 'C'] is iterable
if x == 'A' is condition
'''
#List comprehension
ls = [ord(x) for x in ['A', 'B', 'C']]
print(ls)

#List comprehension
ls = [ord(x) for x in ['A', 'B', 'C'] if x == 'A']
print(ls)

#List comprehension
ls = [i for i in range(10) if i % 2 == 0]
print(ls)
print()

'''
Dictionary comprehension has some basic syntax like
{key : value for (key, value) in iterable}
'''

#Dictionary comprehension
itr = zip([1, 2], ['One', 'Two'])
dc = {k : v for k, v in itr}
print(dc)

#Dictionary comprehension
dc = {x : x ** 2 for x in [1, 2, 3]}
print(dc)

#Dictionary comprehension
dc = {x.upper() : x for x in 'sujay'}
print(dc)


#Dictionary comprehension
dc = {x : x // 2  for x in range(10) if x % 2 == 0}
print(dc)

#Dictionary comprehension
dc = {x : x for x in 'Abhi' if ord(x) >= 65}
print(dc)
