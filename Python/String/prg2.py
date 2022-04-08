# It is not possible to modify a string in Python directly with help of index and assignment


s = "Abhijeet"
# s[0] = 'R' it is not possible, we will get an error
# 'str' object does not support item assignment


#We can modify string in two ways..

#1) Slicing
s = s[ : 3] + 'e' + s[4 : ]
print(s)


#2) Use list
ls = list(s)
ls[3] = 'i'
s = "".join(ls)
print(s)
