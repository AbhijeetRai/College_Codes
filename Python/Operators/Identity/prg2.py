a = "Sujay"
b = "Sujay"

print(a,id(a))
print(b,id(b))

if  id(a) == id(b) : 
    print("Addresses are the same")
