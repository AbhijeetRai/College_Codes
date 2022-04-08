class TrainSpy:

    def __init__(self, func):
        self.func = func 

    def __call__(self, nation):
        print('Learn foreign language')
        return_Value = self.func(nation)
        return return_Value

@TrainSpy
def spying(nation):
    print('Carry espionage in', nation)
    return 'Secret information'

print(spying('PAK')) 

'''
OUTPUT 
Learn foreign language
Carry espionage in PAK
Secret information
'''