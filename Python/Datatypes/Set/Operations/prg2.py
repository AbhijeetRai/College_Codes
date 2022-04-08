'''
'|' can be used for union as well
'''

a = {1, 2, 3}
b = {2, 3, 4}

print(a | b)

# But '|' supports only set as all operands, no other data type

#print(a | [3, 4])
#print(a | (3, 4))
#print(a | {10 : "Sachin", 7 : "MSD"})
