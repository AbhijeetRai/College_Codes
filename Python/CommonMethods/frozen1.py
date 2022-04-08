'''
  frozenset() -> empty frozenset object
 |  frozenset(iterable) -> frozenset object

 insertion order is not guranteed to be preserved in even frozenset, just like set
'''
a = [1,1,1,2]
st = frozenset(a)
print(st, type(st))
print(a, type(a))

print(frozenset({7 : "MSD", 10 : "Sachin", 12 : "Yuvi"}))
