'''
 | dict() -> new empty dictionary

 | dict(mapping) -> new dictionary initialized from a mapping object's
 |      (key, value) pairs

 |  dict(iterable) -> new dictionary initialized as if via:
 |      d = {}
 |      for k, v in iterable:
 |          d[k] = v

 |  dict(**kwargs) -> new dictionary initialized with the name=value pairs
 |      in the keyword argument list.  For example:  dict(one=1, two=2)
 |

 Only dictionary has 4 constructors unlike list, tuple and set having 2 constructors only
'''

#Error

#dc = dict(1)		#Not iterable
#dc = dict([1, 2])
#dc = dict({1, 2})
#dc = dict((1, 2))

dc = dict()
dc[7] = "MSD"
dc[10] = "Sachin"
print(dc, '\n')


dc = dict({12 : "Yuvraj", 48 : "Raina"})
print(dc, '\n')


dc = dict( [ [24, "Ganguly"], (37, "Kumble") ] )
print(dc, '\n')

dc = dict(captain = 'Kumble', Wk = 'Dhoni')
print(dc, '\n')


def fun(**kwargs) :
	dc = dict(kwargs)
	print(dc, '\n')

fun(worldcup1 = 1983, worldcup2 = 2011)
