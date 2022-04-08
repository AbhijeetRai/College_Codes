import io 
fp = open('country.txt', 'r')

ls = []

ls = fp.readlines()
ls1 = []

for nation in ls:
    ls1.append(nation.strip())

record = {
    'Portuguese': 0,
    'French':0, 
    'Chinese':0, 
    'Vietnamese':0, 
    'German':0,
    'English':0, 
    'Japanese':0,
    'Greek':0,
    'Indian':0,
    'Spanish':0,
    'Arabic':0,
    'Hungarian':0,
    'Italian':0
}

st = set(ls1)                   # Using set to avoid redundancy

for a_nation in st: 
    record[a_nation]= ls1.count(a_nation)

print(record, '\n\n')

for key, value in record.items():
    print(key, value)    
