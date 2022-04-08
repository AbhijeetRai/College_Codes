#even string can be used as key
ipl_team = {'CSK' : 'MSD', 'MI' : 'Rohit Sharma', 10 : 'Sachin'}
print(ipl_team['CSK'])

#List, tuple, set and dictionaries can be values as well
international_teams = {'india' : ['Rohit', 'MSD', 'Virat'], 'bcci delegation' : ('shah', 'Ganguly', 5), 'temas' : {'kenya', 'UAE'}, 'captains' : {7 : 'MSD', 10 : 'Sachin'}}
print(international_teams['india'])
print(type(international_teams['bcci delegation']))
