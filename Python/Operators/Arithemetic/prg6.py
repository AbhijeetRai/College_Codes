a = 5
b = 6
c = 4

ans = a // b + c * a - b ** c
print(ans,type(ans))

#first parenthesis is evaluated
#then exponential part is solved

#later multiplication, divison, modulus, floor divison with same priority
#addition and substraction is done afterwards
#lastly assignment is done