value = int(input("Enter the upper range of value to find sum"))

sum = 0
for i in range(1,value+1):
    sum+=i
print(sum)

print("\n",(value/2)*(1+value))
