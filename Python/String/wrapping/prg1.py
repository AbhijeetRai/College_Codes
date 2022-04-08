import textwrap 

line1 = 'I am Abhijeet. I am from Pune'
line2 = 'Im 21 years old. I was born in 1999'

#wrap the paragraph, into lines. where each line will have width - at most char long(here at most 8 char long)
#returns list of 'lines'
print(textwrap.wrap(line1, 8))
print(textwrap.wrap(line2, 8))

print()

#wrap the paragraph, into lines. where each line will have width - at most char long(here at most 8 char long)
#return each line individually
print(textwrap.fill(line1, 8))
print(textwrap.fill(line2, 8))