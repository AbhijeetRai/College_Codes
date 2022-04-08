'''
if we do not import array module
error is
NameError : name 'array' is not defined
'''

from array import *

a = array('i',[0,10,20,30,40,50,60,70,80,90])

print(a[2:5])
print(a[:-5])
print(a[5:])
print(a[:])

print()

print(a[-3:-6])#blank
print(a[-4:])

'''
        1 :     5   :    1
      start    stop     step

      print everything from item at index 1 to item at index 5 (include item at index 1, exclude item at index 5)
      and move ahead by 1 index. Print item at index 1 then print item at index 2 as step is 1
'''
print(a[1:5:1])
print(a[-5:3:2])#blank
