#Consider a set of odd numbers less or equal to 20.

st = {1, 3, 5, 7}

st.add(9)
#st.add([11, 13])               #Unhashable type list, list is mutable, cannot be added in set
#st.add({11, 13})               #Unhashable type set, set is mutable, cannot be added in set
#st.add({11 : 11, 13 : 13})     #Unhashable type dict, dict is mutable, cannot be added in set
st.add((11, 13))
print(st)


print("\n\n")
'''
update(...)
      Update a set with the union of itself and others.
'''

st = {1, 3, 5}
st.update({7, 9})
print(st)

st = {1, 3}
st.update({5, 7}, {9, 11})
print(st)

st = {1, 3}
st.update("Odd", "Even")    #Even string is considered a set of unique characters
print(st)

st = {1, 3}
st.update({7, 5}, {"Odd", "Even"}, {'E', 'V', 'E', 'N'})
print(st)

st = {1 ,3, 5}
#st.update(3, 1)        #Give only iterable elements to set update, int(and float) is not iterable

st = {1, 2, 5}
st.update({1, 2, 5, 7}, {9, 11})
print(st)

print("\n\n")

#Even numbers
st = {2, 4, 6}
st.update([6, 8])
print(st)

st = {2, 4, 6}
st.update([6, 8], (8, 10), {12, 10}, {14 : "Even", 16 : "Even"})
print(st)


print("\n\n")

st = {2, 4, 6}
print(st.update('A')) #update returns none
print(st)


st = {2, 4, 6}
# st.update({8, 10}).update({12, 14})   NoneType has no attribute update
