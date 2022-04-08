#The string will be left justified(move left) because of ljust
#The string should be atleast 10 characters wide(since Abhijeet has 8 chars)
#rest of the two characters will be filled with '$'
print('Abhijeet'.ljust(10, '$'))


#The string will be moved to left on terminal because of ljust
#The string should at least have 5 characters then pad  it with '$'
#'Divya' already has 5 characters, no need to pad it.
print('Divya'.ljust(5, '$'))


#The string will be left justified
#The string atleast have 3 char
#Wani already has 4 characters, so there is no need pad it.
print('Wani'.ljust(3, '$'))


print()
#The string will be moved to center on terminal
#String atleast have 6 characters, wani has only 4. 
#So there should be padding of 2 chars by #
print('Wani'.center(6, '#'))


#The string will be moved to center, and atleast have 9 chars
#Sujay has only 5 chars, so there will be padding by 4 chars.
#Space will be by default used to pad
print('Sujay'.center(9))


print()


#string will be moved to right
#string should atleast have 8 chars, zagade has 6
#so padding of two characters by @
print('Zagade'.rjust(8, "@"))