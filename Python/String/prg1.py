string1 = "Shashi"
string2 = "Shashi"
#Enter Shashi
string3 = input('Enter a string\n')

print('id of string1',id(string1))
print('id of string2',id(string2))
print('id of string3',id(string3))


print(id(string1[0]),' ',id(string1[1]),' ',id(string1[2]),' ',id(string1[3]),' ',id(string1[4]),' ',id(string1[5]))
print(id(string2[0]),' ',id(string2[1]),' ',id(string2[2]),' ',id(string2[3]),' ',id(string2[4]),' ',id(string2[5]))
print(id(string3[0]),' ',id(string3[1]),' ',id(string3[2]),' ',id(string3[3]),' ',id(string3[4]),' ',id(string3[5]))









'''
A program to show input taken from user is stored at seperate place, even if same value exists
According to memory management of python string1 and string2 will point at same address but string3 is stored seperatly
even if it also consists "Shashi"

if we try to print id(string1[6]) - we will get index error
'''
