num = int(input('enter number'))

fact = 1;

for i in range(num,1,-1):
	fact *= i
print(fact)

fact = 1
while(num >= 2):
	fact = num*fact;
	num -= 1
print(fact)