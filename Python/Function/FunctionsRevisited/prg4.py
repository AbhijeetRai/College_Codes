def fun(a, b):
    print(a, b)

'''
fun(10)
a takes the value 10, when fun is called, and then 
"fun() missing 1 required positional argument b", TypeError occurs
'''


'''
In such scenario, set default value of b
'''
def gun(a, b = 50):
    print(a, b)

#a takes 10, b is optional (50)
gun(10)
#a takes 10, b takes 20(50 will be overridden)
gun(10, 20)
#a takes 10, b takes 30
gun(b = 30, a = 10)