import io 

fp = open('myfile.txt', 'w')

fp.write('Line no 1\n')
fp.write('Line no 2\n')
fp.write('Line no 3\n')

fp.close() 

fp1 = open('myfile.txt')
ls = fp1.readlines() 

print('Current location of cursor in file', fp1.tell()) 

print(ls)

for a_line in ls:
    print(a_line, end = "")
    


fp1.close()