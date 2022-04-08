from copy import copy, deepcopy

wc = {7 : 'MSD', 'jersey': [7, 10, 12], 'players': {'Gambhir', 'Raina'}, 'name': ('india', 'ind'), 'role': {'WK': 'Dhoni', 'captain': 'Dhoni'}}
clone = copy(wc)												#shallow copy

clone[7] = 'Sachin'
clone['jersey'][2] = 24
clone['players'].add("Ganguly")
clone['role']['captain'] = "Virat"

print('wc is', wc)
print('clone is', clone)

print('\n\n-----------------------------------------------------------------\n\n')

wc = {7 : 'MSD', 'jersey': [7, 10, 12], 'players': {'Gambhir', 'Raina'}, 'name': ('india', 'ind'), 'role': {'WK': 'Dhoni', 'captain': 'Dhoni'}}
clone = deepcopy(wc)												#deep copy

clone[7] = 'Sachin'
clone['jersey'][2] = 24
clone['players'].add("Ganguly")
clone['role']['captain'] = "Virat"

print('wc is', wc)
print('clone is', clone)