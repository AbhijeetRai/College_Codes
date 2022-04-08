class MyClass: 

    count = 0

    def __init__(self):
        MyClass.count += 1

    @staticmethod
    def staticFunction():
        print(MyClass.count)

MyClass()
MyClass()
MyClass.staticFunction()

'''
Static method is used when generally no processing is required with class variable
'''