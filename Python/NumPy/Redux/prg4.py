from numpy import array

mixList = [1, 2, 4.1, 5]
a = array(mixList)
print(a)

mixList = [10, 20, 30, "Core2Web", 40, 50]
a = array(mixList)
print(a)

intList = [10.5, 20.5, 30.5, 40.5, 50.5]
a = array(intList, dtype = int)
print(a)
