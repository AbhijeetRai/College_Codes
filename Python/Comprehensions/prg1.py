ls=[1,2,3,4]
print(ls,'\n',len(ls))

ls = [int(y) for y in input('\nEnter integer values\n').split()]
print(ls,'\n',len(ls))
for i in range(len(ls)):
    print(ls[i],type(ls[i]));


ls = [str(y) for y in input('\nEnter integer values\n').split()]
print(ls, '\n, len(ls))

for i in range(len(ls)):
    print(ls[i],type(ls[i]));
