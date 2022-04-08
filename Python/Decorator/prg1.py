#A decorator function can be used to wrap 'n' different functions with same functionality.
#A decorator function takes a function as argument, and returns a function.

#A decorator function
def dec(func) :
	
	def begin() :
		print('Make the pan hot, pour oil')
		func()
		print('Garnish with corriander')

	return begin

def cook_chicken() :
	print('Cooking chicken')

cook_chicken = dec(cook_chicken)
cook_chicken()
print('\n\n')


'''
decorated cook_mutton with dec(func)
same as 
cook_mutton = dec(cook_mutton)
'''
@dec
def cook_mutton() :
	print('Cooking mutton')

cook_mutton()
