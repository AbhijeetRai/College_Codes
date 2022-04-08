def dec(func) :

	def begin() :
		print('Address of func is', func)

	print('Address of begin is', begin)
	return begin


def cook_chicken() :
	print('Cook chicken')

print('Cook_chicken add before call', cook_chicken)

cook_chicken = dec(cook_chicken)
cook_chicken()

print('cook chicken add afer call', cook_chicken)