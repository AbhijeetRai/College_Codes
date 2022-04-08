ls = ['Ganguly', 'Kumble', 'MSD']

print(id(ls[0]), id('Ganguly'))
print(id(ls[1]), id('Kumble'))
print(id(ls[2]), id('MSD'))
print()


dc = {'Captain' : 'Ganguly', '37' : 'Kumble', 7 : 'MSD'}

print(id(dc['Captain']), id('Ganguly'))
print(id(dc['37']), id('Kumble'))
print(id(dc[7]), id('MSD'))

print()
