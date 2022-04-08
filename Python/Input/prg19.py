#you must enter exactly two values because there are two variables to take input

roll,aadhar = [int(x) for x in input('Please enter aadhar and roll no\n').split()]
print(roll,type(roll))
print(aadhar,type(aadhar))

print('the roll is ',roll)
print('the aadhar is ',aadhar)


print('the roll is {} the aadhar is {}'.format(roll,aadhar))
