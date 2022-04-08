ls = [[1, 2], {5, 6}, [1, 2], 1]
ls.remove([1, 2])
ls.remove(1)
print(ls)


print()


#pop method removes and returns element at index(default last)
ls = [[1, 2], {5, 6}, 1]
print(ls.pop())
print(ls)
print(ls.pop(0))
print(ls)
