# Whenever, stop becomes equal to start
# or stop exceeds start in the "OPPOSITE DIRECTION  of update"
# nothing is printed


'''
When update is negative slicing happens from stop(inclusive) to left of stop
When update is positive slicing happens from stop(inclusive) to right of stop
'''


friends = ["Sujay", "Divya", "Zagade", "Abhishek", "Rajat", "Sahil", "Adya"]

print(friends[-1: -3 : ])
print(friends[-1 : -3 : -1])
print(friends[: -1 : -1])
print(friends[-6 : -1 : -2])
print(friends[-6 : -1 : ])
print(friends[-1 : -7 : 2])
print(friends[-1 : -7 : -2])
