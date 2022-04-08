def factorial(number) :

	"""
	A function that finds out the factorial of numbers
	"""

	result = 1

	while(number >= 2) :
		
		result *= number
		number -= 1

	return result

result = factorial(6)
print(result)
