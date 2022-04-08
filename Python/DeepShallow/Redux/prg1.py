ls1 = [1, [1, 2], {1, 2}, (1, 2), {1 : "Abhijeet", 2 : "Sanket"}]
ls2 = ls1.copy()				#shallow

for i in range(len(ls1)):
	print(id(ls1[i]), id(ls2[i]))		#same content, same address

print("\n\n")


from copy import deepcopy
ls1 = [1, [1, 2], {1, 2}, (1, 2), {1 : "Abhijeet", 2 : "Sanket"}]
ls2 = deepcopy(ls1)				#deep

for i in range(len(ls1)):
	print(id(ls1[i]), id(ls2[i]))	#but in deep copy, different address for mutable collections.
									#so that if one mutable collection change, it  is not refelcted in other
print("\n\n")