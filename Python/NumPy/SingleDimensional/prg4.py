#compare this program to prg5.py line by line for better
#understanding

import array as arr

#list in nomral array
ls = [1,2,3,4]
a = arr.array('i',ls)

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
#dictionary in nomral array
dt = {7:"MSD",10:"Sachin"}
a = arr.array('i',dt)

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
