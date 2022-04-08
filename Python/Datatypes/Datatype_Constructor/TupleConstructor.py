'''
tuple() -> empty tuple
tuple(iterable) -> tuple initialized from iterable's items
'''

#tp = tuple(4.5)    #argument passed must be iterable

tp = tuple("TUPLE")
print(tp)

from numpy import array
a = array([1, 2, 3])
tp = tuple(a)
print(tp)

dc = {18 : "VK", 10 : "ST"}
tp = tuple(dc)
print(tp)
