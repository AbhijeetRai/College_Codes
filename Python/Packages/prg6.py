import io 

fp = open('empdata.txt', 'r')

total = 0
while True: 
    a_line = fp.readline()

    if a_line:
        a_list = a_line.split(':')
        total += int(a_list[3])

    else:
        break

print('Employee total', total)