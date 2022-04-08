def fact(num):

    fact = 1
    while(num>1):
        fact *= num
        num -= 1;
    return fact

number = int(input('Enter the integer to find factorial\n'))
print(fact(number))

factorial = fact(number)
print(factorial)

print(fact(int(input('Enter the integer to find factorial'))))
