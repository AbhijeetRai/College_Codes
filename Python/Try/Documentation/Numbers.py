class Numbers :

	"""
	This class will be used to perform operations on numbers.
	To find out their factorial, check whether the number is prime
	"""

	def isPrime(self, number) :
		
		'''
		A method to check whether a number is prime
		'''

		i = 2

		while(i <= number / 2) :

			if number % i == 0:
				return False

			i += 1

		return True

	
	def factorial(self, number) :

        	"""
        	A function that finds out the factorial of numbers
        	"""

        	result = 1

        	while(number >= 2) :

                	result *= number
                	number -= 1

        	return result
