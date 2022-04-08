def decorator(aClass):
    aClass.instanceCount = 0
    aClass.desciption = "It is random class" 
    return aClass 

@decorator
class RandomClass:
    pass

print(RandomClass.instanceCount)
print(RandomClass.desciption)