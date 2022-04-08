a = frozenset([1, 2, 3])

print(a.issubset([1, 2, 3, 4, 5, 6]))
print(a.issuperset([1]))
print(a.isdisjoint(frozenset([1])))
print(a.isdisjoint(frozenset([])))
