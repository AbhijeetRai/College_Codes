tuple1 = (10,20,30)
tuple2 = ("Shashi","Ashish","Kanha")
tuple3 = tuple1+tuple2

list1 = [10,20,30]
list2 = ["Shashi","Ashish","Kanha"]
list3 = tuple1+tuple2

print(tuple3)
print(list3)
print(type(list3))

list3 = list1+list2
print(list3)
print(type(list3))

list3 = list3+list1
print(list3)

list3.clear()
print(list3)
