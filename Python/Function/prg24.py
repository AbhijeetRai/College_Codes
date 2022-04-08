val1 = 0
val2 = 1

for i in range(4):
    print(val1)
    sum = val1+val2
    val1=val2
    val2=sum

print(sum,val1,val2)
