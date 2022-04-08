from copy import copy, deepcopy

wc = {7 : 'MSD', 'jersey': [7, 10, 12], 'players': {'Gambhir', 'Raina'}, 'name': ('india', 'ind'), 'role': {'WK': 'Dhoni', 'captain': 'Dhoni'}}
clone = copy(wc)												#shallow copy

print(id(wc[7]), id(clone[7]))
print(id(wc['jersey']), id(clone['jersey']))
print(id(wc['players']), id(clone['players']))
print(id(wc['name']), id(clone['name']))
print(id(wc['role']), id(clone['role']))

print('\n---------------------------------------------------------\n')

wc = {7 : 'MSD', 'jersey': [7, 10, 12], 'players': {'Gambhir', 'Raina'}, 'name': ('india', 'ind'), 'role': {'WK': 'Dhoni', 'captain': 'Dhoni'}}
clone = deepcopy(wc)												#deep copy

print(id(wc[7]), id(clone[7]))
print(id(wc['jersey']), id(clone['jersey']))
print(id(wc['players']), id(clone['players']))
print(id(wc['name']), id(clone['name']))
print(id(wc['role']), id(clone['role']))


'''
In shallow copy, only one thing is obeyed - if content is same, address is same, no matter what. However,
In deep copy, addresses of nested mutable collections(values here) are kept different, so that if nested mutable collection changes,
the change is not reflected in other object
'''