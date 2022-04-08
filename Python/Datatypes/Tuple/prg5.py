# new objects of list is created twice and tuple twice

#refer str.java and prg9.py prg10.py prg11.py

list = ["Abhijeet",21]

print("List before modification : ")
print(list,id(list))

list = ["Abhijeet Rai",21]

print("List after modification : ")
print(list,id(list))

tuple = ("Abhijeet",21)

print("Tuple before modification : ")
print(tuple,id(tuple))

tuple = ("Abhijeet Rai",21)

print("Tuple after modification : ")
print(tuple,id(tuple))