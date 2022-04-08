from numpy import *

lsstr = ["Abhijeet","Divya","Sujay"]
lsint = [56,16,69]

arrstr = array(lsstr)
arrint = array(lsint)

#array module takes 2 parameter as datatype
# and it is not able to understand what kind of data is arrint
arrmix = array(arrstr,arrint)
print(arrmix)
