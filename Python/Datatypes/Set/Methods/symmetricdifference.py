a = {2, 4, 6, 8, 10}
#b = a.symmetric_difference([12, 14, 8], {2, 16}, "Abhi")   #takes only one argument


a = {2, 4, 6, 8, 10}
b = a.symmetric_difference([12, 14, 8])   #takes only one argument
print(a, type(a))
print(b, type(b))

a = {2, 4, 6, 8, 10}
#b = a.symmetric_difference(8) #give only iterable

a = {2, 4, 6, 8, 10}
#b = a.symmetric_difference_update(1.1)  #give only iterable

print()

a = {2, 4, 6, 8, 10}
#b = a.symmetric_difference_update([12, 14, 8], [1, 2])   #takes only one argument
print(a, type(a))
print(b, type(b))
