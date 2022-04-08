from array import array

#a = array('Z', ['a', 'b']) 				#bad typecode

a = array('u', 'Abhi')
print(a, a.itemsize)

#a = array('u', ['Abhi'])					#Array item must be unicode character

a = array('f', [1, 2, 3])
print(a, a.itemsize)						#itemsize - length in bytes, of one array item

a = array('d', [1, 2, 3])
print(a, a.itemsize)						#itemsize - length in bytes, of one array item