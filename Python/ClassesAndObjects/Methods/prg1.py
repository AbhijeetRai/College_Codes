class Demo: 

    # This is instance method, it is called on object, and accepts that object as argument
    def fun(self):
        print('In fun')

    # This is static method. It is called on class and object is not passed to it.
    def gun():
        print('In gun')

    # Call this method on class or object, does not matter
    def run(self = None):
        print(self, 'in run')



d1 = Demo() 
d1.fun()
Demo.gun()

Demo.run()      # Using run as static method
d1.run()        # Using run as instance method