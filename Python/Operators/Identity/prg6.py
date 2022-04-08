tuple1 = ("Abhijeet",22,"Rai")
tuple2 = ("Abhijeet",22,"Rai")

#tuples are immutable
print(type(tuple1),id(tuple1))
print(type(tuple2),id(tuple2))
print(tuple1 is tuple2)


s = {"Abhijeet",22,"Rai"}
s1 = {"Abhijeet",22,"Rai"}
print(s is s1)


dict = {1:"Abhijeet",2:"Sujay"}
dict1 = {1:"Abhijeet",2:"Sujay"}
print(dict is dict1)
