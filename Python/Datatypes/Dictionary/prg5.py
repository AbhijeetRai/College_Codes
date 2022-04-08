#Even boolean with other primitive data types is immutable in Python. It can be used as key

dic = {int : 1, str : 22, float : "Raju", tuple : 'India'}
print(dic)


dic = {int : 1, str : 22, list : "Raju", set : 'India'}
print(dic)
