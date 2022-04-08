import numpy

b = [int(x) for x in input('Enter items for tuple\n').split()]
tp = tuple(b)

#tuple has been passed to array
a = numpy.array(tp)
print('a is',a,'and type of a is',type(a))

for i in a:
    print(i)

print('firse wahi array...')
for i in range(len(a)):
    print(a[i])
