#like case 2 of prg20 in input
str = input('\nEnter any number of integer values\n')
ls = [str]
print(ls,'\n',len(ls))
for i in range(len(ls)):
    print(ls[i],type(ls[i]));

#like case 2 of prg20 in input
ls = [input('\nEnter any number of integer values\n')]
print(ls,'\n',len(ls))
for i in range(len(ls)):
    print(ls[i],type(ls[i]));

#like case 3 of prg20 in input
ls = [input('\nEnter any number integer values\n').split()]
print(ls,'\n',len(ls))
for i in range(len(ls)):
    print(ls[i],type(ls[i]));
