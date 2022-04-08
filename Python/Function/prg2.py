low,high = [int(x) for x in input('Put lower and upper values\n').split()]
sum = 0

for i in range(low,high+1):
    sum += i
print(sum)

print((high-low+1)/2 * (low+high))

'''
n/2 * (a+l)
n - no of terms
a - first term
l - last term
'''
