from sys import argv

class Dog:

    def display(self, name, age):
        print(name, age)

# Pass name and age of dog from command line
Dog().display(argv[1], argv[2])
