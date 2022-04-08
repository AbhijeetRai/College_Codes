ls = ["Rai",21,6.1]

ls.insert(2,"Abhijeet")
print(ls)

# ls = ['Rai', 21, 'Abhijeet', 6.1]

ls.insert(4,"Teen")
print(ls)

ls.insert(7,"Saint Vincent")
print(ls)

# ls.insert() #type error  : insert() takes exactly two arguments (0 given)

ls.insert(0,2)
print(ls)

# ls.insert("Rai") #TypeError: insert() takes exactly 2 arguments (1 given)
#ls.insert(1) #TypeError: insert() takes exactly 2 arguments (1 given)
