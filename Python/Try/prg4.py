def petrolpump():

	def typeFuel():
		print('Petrol')

	def storage():
		print('Available - 100L')

	def amount():
		print('80Rs\\L')

	return typeFuel,storage,amount




def write(all):

	for i in all:
		i()

write(petrolpump())