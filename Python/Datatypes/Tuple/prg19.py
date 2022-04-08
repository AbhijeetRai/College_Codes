country_Game = (('India', 'Hockey', 'Cricket'), ('England', 'Cricket', 'Football'))

'''
country_Game[0][1] = 'Football'
Error - country_Game[0][1] is nothing but a tuple, and we cannot make changes inside a tuple
'tuple' object does not support item assignment
'''

for i in range(len(country_Game)):
    print(country_Game[i][1])