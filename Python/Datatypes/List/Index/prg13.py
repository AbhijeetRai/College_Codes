#elements in the list can be duplicated
ls = ["Shashi",10,20.5,"Shashi","35.6"]

print(ls[4][0])
print(ls[4][1])
print(ls[4][2])
print(ls[4][3])


#elements in the list can be duplicated
list1 = ["Core2Web",ls,356,"Core2Web"]         #['Core2Web', ['Shashi', 10, 20.5, 'Shashi'], 356, 'Core2Web']

print(list1[0][1])
