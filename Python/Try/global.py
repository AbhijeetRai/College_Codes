a = 2

def fun() :

	a = 1
	print(a)

	'''
	globals returns a dictionary, which stores every global variable as key
	global variable is not stored as variable but as string literal
	'''
	print(globals()['a'])

fun()