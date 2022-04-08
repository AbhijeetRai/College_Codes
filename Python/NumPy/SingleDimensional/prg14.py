from numpy import *

a = array([str(x) for x in input('Enter strings\n').split()])

for str in a:
    if 'i' in str:
        print(str)
