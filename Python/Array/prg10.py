ls = [1,2,3,4]

from array import *

a = array('i',ls)
#Generator expression must be parenthesized if not sole argument
b = array('i',i * 2 for i in ls)
