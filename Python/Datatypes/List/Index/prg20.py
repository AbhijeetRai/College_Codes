'''
L.remove(value) -> None -- remove first occurrence of value.
Raises ValueError if the value is not present.
'''

friends = ['Sujay', 'Prerona','Wani', 'Divya', 'Zagade', 'Prerona']
#first occurance of prerona removed
friends.remove('Prerona')               
print(friends)      # list is now [Sujay, Wani, Divya, Zagade, Prerona]

'''
pop(...)
L.pop([index]) -> item -- remove and return item at index (default last).
Raises IndexError if list is empty or index is out of range.
'''

print(friends.pop()) # Prerona will be returned and removed
print(friends)       # friends is now, Sujay, Wani, Divya, Zagade

friends.pop(2)      #item at index 2 removed, divya removed
print(friends)