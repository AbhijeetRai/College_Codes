dc = {37 : "Kumble", 7 : "MSD"}

print(dc.get(12))
print(dc.get(7))
print(dc.get(7, "Rahul"))
print(dc.get(12, "Yuvraj"))         #12 is jersey of yuvi

print(dc, '\n')

dc = {12 : "Yuvraj", 24 : "Ganguly"}
print(dc.setdefault(12))
print(dc)

print(dc.setdefault(12, "Raina"))
print(dc, '\n')

print(dc.setdefault(48))
print(dc)

print(dc.setdefault(37, "Kumble"))
print(dc)
