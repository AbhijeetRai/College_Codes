def cooking_on_tandoori(func) :

	def tandoori() :
		print('Ignite tandoori')
		func()
		print('Extinguish tandoori')

	return tandoori

def prepare_indigridents(function) :

	def spices() :
		print('Cook spices')
		function()
		print('Garnish with corriander')

	return spices

@cooking_on_tandoori
@prepare_indigridents

#Firstly, evaulate the decorator at bottom
#(prepare_indigridents). See both lines beginning with
#'@' above as, cook_chicken = prepare_indigridents(cook_chicken)
#address of cook_chicken() is passeed to prepare_indigridents()
#cook_chicken holds address of spices() now. Then,

#cook_chicken = cooking_on_tandoori(cook_chicken)
#addess of spices() is passed to cooking_on_tandoori().
#cook_chicken holds address of tandoori() now.

def cook_chicken() :
	print('Cook chicken')

cook_chicken()
