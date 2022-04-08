#in list modification on same address(object) was done therefore it is mutable

a = ["apple","mango","lichi"]
print(id(a),a)
del a[0]
print(id(a),a)


a = ("Apple","Mango","Lichi")
del a[1]

#in tuple modification is not possible because it is immutable 
#TypeError: 'tuple' object does not support item deletion

