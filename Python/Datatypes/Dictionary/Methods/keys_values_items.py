dc = {12 : "Yuvraj", 24 : "Ganguly", 48 : "Raina"}

for i in dc.keys() :
    print(i, end = " ")
print()

for i in dc.values() :
    print(i, end = " ")
print()

for key, value in dc.items():
    print(key, value, sep = ": ", end = " ")
print()
