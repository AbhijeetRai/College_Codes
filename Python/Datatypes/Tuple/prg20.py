'''
We can insert a list inside a tuple and then modify list object
'''
country_Game = (['India', 'Hockey', 'Cricket'], ['England', 'Cricket', 'Football'])
print(type(country_Game[0]), type(country_Game[1]))
print(country_Game)

country_Game[0][1] = 'Football'
print(country_Game)

country_Game[0].append('Hockey')
print(country_Game)