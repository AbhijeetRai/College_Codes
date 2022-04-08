'''
   min(iterable, *[, default=obj, key=func]) -> value
   min(arg1, arg2, *args, *[, key=func]) -> value

	MIN AND MAX never need dissimilar data

'''
#print(min(54.1))													#float object is not iterable

print(min('Zagade', 'Divya', 'Sujay', 'Tushar'))
#print(min('Zagade', 'Divya', 'Sujay', 'Tushar', 1.1))  				# < not supported between instance of float and str

print(min( (7, 12), (12, 24), (7, 48), (0, 10) ))
#print(min( (7, 12), (12, 24), (7, 48), (0, 10), 'Abhi' ))				# < not supported between instance of str and tuple

print('\n--Exception in code given below----------------------------------------\n\n')

print(min([1, 2], [1, 2, '3']))			#While comparing it lexicographically int is not compared with str, hence error was not given
#print(min([1, '2'], [1, 2, 3]))			#But here while lexcicographic comparison int was compared with str, hence error was given