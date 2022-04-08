import sys

ls1 = [int(x) for x in input('Enter the first list\n').split()]
ls2 = [int(x) for x in input('Enter the second list\n').split()]

if(len(ls1) <= len(ls2)):
    print('Enter first list bigger than second')
    exit()

count = 0
for i in ls1:
    for j in ls2:
        if i == j :
            count += 1

print('all elements of ls2 in ls1') if count == len(ls2) else print(count,'elements of ls2 in ls1') if count < len(ls2) and count != 0 else print('none')
