'''
class zip(object)
   zip(iter1 [,iter2 [...]]) --> zip object
'''

item = ['chicken', 'mutton', 'fish']
dish = ['65', 'biryani', 'curry']

print(zip(item, dish))              #returns zip object

print()

print(list(zip(item, dish)))
print(set(zip(item, dish)))
print(tuple(zip(item, dish)))
print(dict(zip(item, dish)))

print()

friends = ['Abhijeet', 'Divya', 'Tushar']
their_friends = ('Urjita', 'Shubham', 'Sheetli')
print(set(zip(friends, their_friends)))
