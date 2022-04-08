import numpy

a = numpy.array([int(x) for x in input('Enter array\n').split()])
print('a is',a,'and type of a is',type(a))


for i in a:
    print(i)
print('firse wahi array...')
for i in range(len(a)):
    print(a[i])
