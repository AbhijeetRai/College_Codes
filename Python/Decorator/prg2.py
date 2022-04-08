def dec(func) :

	def begin(quant) :
		print('Pour oil, mix spices')
		func(quant)
		print('Put corriander')
	
	return begin

def chicken(quant) :
	print('Cook', quant, 'Kg chicken')

chicken = dec(chicken)
chicken(0.5)

print('\n\n')

@dec
def mutton(quant) :
	print('Cook', quant, 'Kg mutton')
mutton(1)
