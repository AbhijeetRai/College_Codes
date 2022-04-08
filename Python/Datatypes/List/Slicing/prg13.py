ls = ["Rai",21,6.1]

ls.insert(3,"Rai")
print(ls)

print(ls.__sizeof__())
print(ls.count(21))

print(ls.count("Rai"))
print(ls.count("Pune"))

ls.remove("Rai")
print(ls)

ls.remove("Rai")
print(ls)

#ls.remove("Rai") #valueError : list.remove(x) not in the list

ls.insert(0,"Rai")
print(ls)

ls.reverse()
print(ls)

ls.clear()
print(ls)
