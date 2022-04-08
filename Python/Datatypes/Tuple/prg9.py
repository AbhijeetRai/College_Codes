#in list modification on same address(object) was done, therefore it is mutable

a = ["apple","mango","lichi"]
print(id(a),a)


a[0] = "berry"
print(id(a),a)

a = ("Apple","Mango","Lichi")
a[0] = "Beery"

#in tuple modification is not possible because it is immutable 
#TypeError: 'tuple' object does not support item assignment

