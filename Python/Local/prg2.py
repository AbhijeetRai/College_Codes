a = 40
def fun():

	#global variables have read access
    print(a)
    b = a + 1
    print(b)

fun()


b = 80
def run():

	'''
	UnboundLocalError - local variable 'b' referenced before assignment
	Iske pahle, b ko value assign hoti, hum b ko access karna chah rahe hai

	Python thinks that we want to intialise a local variable with name b
	'''

	#b = b + 20
	print(b)

run()



c = 120
def gun():
	
	'''
	Now we want to tell python  that we want to acess the global variable c
	We will declare it as global
	'''
	global c
	c = c+1	
	print(c)

gun()
print(c)



d = 500
def gun():

	#now this d will be treated as local variable and will print different value
	d = 200
	print('d in gun is',d)

gun()
print('d out of gun is',d)