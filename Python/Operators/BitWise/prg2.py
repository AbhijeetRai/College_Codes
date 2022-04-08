
a = 10
b = 4


print(a & b)
'''
bit by bit operation of bitwise and
10 = 1 0 1 0 (in binary)
4  = 0 1 0 0 (in binary)
binary anding of 10 and 4 is 0, hence the answer is 0
had it been logical and, answer would have been 4 in python
'''


print (a | b)
'''
bit by bit operation of bitwise or
10 = 1 0 1 0 (in binary)
4  = 0 1 0 0 (in binary)
binary or of 10 and 4 is 14, hence the answer is 14
had it been logical or, answer would have been 10 in python
'''


print(a >> 2)
'''
right shift
a is 1010 in binary shift two binary digits to right
a is 0010 now, and that is 2
'''

print(a<<2)
'''
Integers are stored, in memory, as a series of bits. For example, the number 6 stored as a 32-bit int would be:

00000000 00000000 00000000 00000110
Shifting this bit pattern to the left one position (6 << 1) would result in the number 12:

00000000 00000000 00000000 00001100
As you can see, the digits have shifted to the left by one position, and the last digit on the right is filled with a zero.
You might also note that shifting left is equivalent to multiplication by powers of 2.
So 6 << 1 is equivalent to 6 * 2, and 6 << 3 is equivalent to 6 * 8.
A good optimizing compiler will replace multiplications with shifts when possible.
'''
