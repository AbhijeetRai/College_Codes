ls = list()
ls.append([1, 2])
ls.append({3, 4})
ls.append((5, 6))
ls.append({7 : "MSD", 10 : "Sachin"})

for i in ls:
	print(i, type(i))
#list can store all in-built data structure

print()


st = set()
#st.add([1, 2, 3]) list cannot be added in set, it is unhashable(mutable)
#st.add({1, 2, 3}) set cannot be added in set, it is unhashable(mutable)
#st.add({7 : "MSD", 10 : "Sachin"}) dictionary cannot be added in set, it is unhashable(mutable)
st.add((1, 2, 3))

# we can add only immutable data types in set
print(st)


print()


#tuple can store all data structures
tp = ([1, 2], {3, 4}, (5, 6), {7 : "MSD", 10 : "Sachin"})
for i in tp:
	print(i, type(i))


print()

dc = dict()

#dc[[1, 2, 3]] = "MSD" 	#key must be immutable
#dc[{1, 2, 3}] = "MSD"	#key must be immutable
#dc[{7 : "MSD", 10 : "Sachin"}] = "India" #key must be immutable 
dc[(1, 2, 3)] = "tuple"			

#value can be of any type
dc["List"] = [1, 2]
dc["set"] = {1, 2}
dc["tuple"] = (1, 2)
dc["dict"] = {7 : "MSD", 10 : "Sachin"}
print(dc)