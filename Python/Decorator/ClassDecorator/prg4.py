def decorator(aClass):
    aClass.instanceCount = 0
    aClass.desciption = "It is random class" 
    return aClass 

@decorator
class RandomClass:
    pass

@decorator
def randomfunction():
    pass

print(randomfunction.instanceCount)