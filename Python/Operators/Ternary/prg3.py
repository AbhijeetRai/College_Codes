'''
Nested Ternary operator
'''

NRC = False;
CAB = False;
status = 'NRC implemented ' if NRC else 'CAB implemented' if CAB else 'CAB not implemented'
print(status)
