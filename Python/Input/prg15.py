#taking multiple input on same line

#you must enter excatly three values
name,roll,city = input("Please enter name roll and city\n").split()
roll = int(roll)
print(name,roll,city)
print("The name is {} the roll is {} the city is {}".format(name,roll,city))
