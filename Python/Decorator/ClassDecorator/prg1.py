class TrainSpy:

    def __init__(self, func):
        self.func = func 

    def __call__(self): 
        print('Teach foreign language')
        self.func()

@TrainSpy
def spying():
    print('Carry espionage')

spying() 

'''
OUTPUT 
Teach foreign language
Carry espionage
'''