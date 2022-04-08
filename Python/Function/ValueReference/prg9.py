def change_Age(ageCopy):
    print(id(ageCopy))
    ageCopy += 5
    print(id(ageCopy))

def changeDic(dic):
    print(id(dic))
    del(dic[65])
    print(id(dic))

age = int(input('Enter age\n'))
print(id(age))
change_Age(age)
print(age)

dict = {65 : "A", 66 : "B"}
print(id(dict))
changeDic(dict)
print(dict)
