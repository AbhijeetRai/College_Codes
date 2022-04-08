limit = int(input("Enter limit : "))

for i in range(3, limit + 1):

    if(i % 2 == 0):
        continue

    else:
        print(i)
