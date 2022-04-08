#comparison between normal and numpy array

import numpy
import array as arr

#5 will be tpyecasted into int with loss of data after decimal
a = numpy.array([1,2,3,4,5.5],int)
for i in a:
    print(i,type(i))

print()
#everything upcasted to float
a = arr.array('d',[1,2,3,4,5.5])
for i in a:
    print(i,type(i))

print()

#normal array me data loss nai chalega if we typecase float into int
#error dega
#numpy array me decimal k bad data LOOSE HUA and float int me badal gaya
print()
a = arr.array('i',[1,2,3,4,5.5])
for i in a:
    print(i,type(i))
