def tech(require):
    if require == "Java":
        return "Android"
    else :
        return "I dont know"

print(tech(input('Enter the requirement')))
