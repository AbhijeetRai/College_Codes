'''
Non local variable is used in nested function
'''

#1
def fun(x,y):

	def gun(a,b):

		a = a + 1
		b = b + 1

		'''
		Here python is declaring a new local variable x and y, for function gun
		and these local variables are referenced before assignment
		'''

		#x = x + 1
		#y = y + 1

		print(a,b,x,y)

	gun(5,3)
	print(x,y)

fun(8,10)

print("\n\n")

#2
def man(y):

	def wan():

		 y = 10
		 print('Y - local variable of wan is',y)

	wan()
	print('Y - variable of man is',y)

man(30)


print("\n\n\n")


#3
def outer(x,y):

	def inner():

		'''
		We have to tell python do not intialise new local variable rather, access the non local one
		'''

		nonlocal x,y
		x = x+10
		y = y+10 
		print(x,y)

	inner()
	print(x,y)

outer(10,20)


print("\n\n\n")

#4
def foo():

	a = 10

	def woo():

		#read access is granted
		print('a is',a)

	woo()

foo()
