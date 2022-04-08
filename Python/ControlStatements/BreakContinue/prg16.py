val = 7
for i in range(4):
    for j in range(i+1):
        print(val,end="\t")
        val += 7
    print()
