from array import array

print(len([1, 3, 3]))
print(len({1, 3, 3}))
tp = (1, 3, 3)
print(len(tp))
print(len({7 : "MSD"}))
print(len("Hii"))

a = array('i', [1, 2, 3, 4, 5])
print(len(a))

print('\n-------------------------------\n')

ls = [1, 2, 3, (1, 2), 3]
tp = (1, 2, 3, (1, 2), 3)

print(ls.count(11))
print(ls.count(3))
print(ls.count((1, 2)))

print()

print(tp.count(11))
print(tp.count(3))
print(tp.count((1, 2)))
