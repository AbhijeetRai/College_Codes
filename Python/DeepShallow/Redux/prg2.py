from copy import *

tp1 = (1, [2, 4], {1, 2}, (5, 7), {7:"MSD", 10 : "Sachin"})
tp2 = copy(tp1)		#shallow

for i in range(len(tp1)):
	print(id(tp1[i]), id(tp2[i]))		#same content same address

print("\n\n")

tp1 = (1, [2, 4], {1, 2}, (5, 7), {7 : "MSD", 10 : "Sachin"})
tp2 = deepcopy(tp1)

for i in range(len(tp1)):
	print(id(tp1[i]), id(tp2[i]))