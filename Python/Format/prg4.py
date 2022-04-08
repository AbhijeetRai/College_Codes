'''
format can also be used for type conversion

More parameters can be included within the curly braces of our syntax. Use the format code syntax {field_name:conversion},
where field_name specifies the index number of the argument to the str.format() method,
and conversion refers to the conversion code of the data type.

s – strings
d – decimal integers (base-10)
f – floating point display
c – character
b – binary
o – octal
x – hexadecimal with lowercase letters after 9
X – hexadecimal with uppercase letters after 9
e – exponent notation
'''

print("The binary of {0} is {1:b}".format('hundred',100))
print('The {1} of 100 is {0:o}'.format(100,'octal'))
