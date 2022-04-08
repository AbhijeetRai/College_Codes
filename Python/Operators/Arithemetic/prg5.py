x = 3
y = 4
z = 5


ans = x + y * (z / x) + y + x ** y * (x // z) 
print(ans,type(ans))


#first parenthesis is evaluated
#then exponential part is solved

#later multiplication, divison, modulus, floor divison with same priority
#addition and substraction is done afterwards
#lastly assignment is done