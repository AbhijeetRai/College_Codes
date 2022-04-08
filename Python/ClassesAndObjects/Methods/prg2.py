class Demo: 

    # Can be used as static as well as instance method
    def fun(*args):
        print(args) 


Demo().fun() 
Demo.fun()