import io 

fp = open('empdata.txt', 'r')
record = {}


while True: 
    a_line = fp.readline()

    if a_line: 
        a_line = a_line.rstrip()
        a_list = a_line.split(":")
        record[a_list[0]] = a_list[1:]

    else: 
        break

records = sorted(record)

total = 0
for keey in records:
    total += int(record[keey][2])
    print(keey,record[keey], sep = ":")

print('Total salary is', total)