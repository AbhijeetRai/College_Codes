import array as arr

a = arr.array('i',[12,3])
print(a)

for i in a:
    print(i)


print()

a = arr.array('i',[int(x) for x in input("Enter Integers\n").split()])
for i in a:
    print(i)
