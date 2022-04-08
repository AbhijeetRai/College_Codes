x = 10
y = 11

print('x & y = ', x & y)
print('x | y = ', x | y)
print('x ^ y =', x ^ y)

print('x << 2 = ', x << 2)
print('y >> 2 = ', y >> 2)
print('~x = ', ~x)

'''
NOT ~ :

Binary of x(10) is 0000 1010 (in 8 bits)
Simply reverse(not) all the bits 1111 0101

Consider number 11 in binary - 0000 1011
Take one's compliment 1111 0100
Add 1 to one's compliment of 11 to take two's compliment (two's compliment of integer value n is -n)

1111 0101 - it is nothing but -11.
1111 0101 are also bits for ~(not of)10
'''
