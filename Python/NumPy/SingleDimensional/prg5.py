from numpy import array

#list in numpy array
ls = [5,6,7,8]
a = array(ls)

#1
print(a)

#2
for i in a:
    print(i,end=" ")
print()

#3
for i in range(len(a)):
    print(a[i],end=" ")
print()

print()
#dictionary in numpy array
dt = {18:"Virat",45:"Rohit"}
a = array(dt)


#1
print(a)

#2
#error - iteration over 0-d array
'''
for i in a:
    print(i,end=" ")
print()
'''

#3
#error - len() of unsized object
'''
for i in range(len(a)):
    print(a[i],end=" ")
print()
'''


#4
#one extra case here
#error - too many indices for array
'''
print(a[0])
'''
