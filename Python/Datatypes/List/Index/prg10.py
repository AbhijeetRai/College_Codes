
#elements in the list can be duplicated
ls = ["Shashi",10,20.5,"Shashi"]

#elements in the list can be duplicated
list1 = ["Core2Web",ls,356,"Core2Web"] #['Core2Web', ['Shashi', 10, 20.5, 'Shashi'], 356, 'Core2Web']
print(list1)

print(list1[1][0])
print(list1[-3][1])

print()

print(list1[1][2])
print(list1[1][-2])
print(list1[-3][-2])
print(list1[-3][2])
