class Dog:

    def display(*variables):
        print(variables)
        print(variables[0])
        print(variables[1])
        print(variables[2])

        
#First argument is address of Object
#Second is "Coffee"
#Third is "is 12"
Dog().display("Coffee", "is 12")
