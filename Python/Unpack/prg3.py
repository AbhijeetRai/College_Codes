#-------------------------------------------------------------------------------------------#
a, b = [str (x) for x in [1, 2]]							#List - List					|
print(a, b)


a, b = [int (x) for x in {'11', '22'}]						#List - Set						|
print(a, b)

a, b = [chr (x) for x in (65, 66)]							#List - Tuple					|
print(a, b)

a, b = [int (x) for x in {'7' : "MSD", '10' : "Sachin"}]	#List - Dictionary				|
print(a, b)

a, b, c, d = [ord(x) for x in 'Abhi']						#List - String					|
print(a, b, c, d)

from array import array
a = array('i', [101, 202, 303])
a, b, c = [str(x) for x in a]
print(a, b, c)												#List - Array 					|

print()
#-------------------------------------------------------------------------------------------#
a, b = {ord (val) for val in ['A', 'B']}					#Set - List						|
print(a, b)

a, b = {chr (x) for x in {66, 67}}							#Set - Set						|
print(a, b)

a, b = {int (val) for val in ('22', '6')}					#Set - Tuple					|
print(a, b)

a, b = {str (x) for x in {7 : "MSD", 10 : "Sachin"}}		#Set - Dictionary				|
print(a, b)

a, b, c, d = {ord(x) for x in 'Abhi'}
print(a, b, c, d)											#Set - String 					|

from array import array
a = array('i', [101, 202, 303])
a, b, c = {str(x) for x in a}
print(a, b, c)												#Set - Array

print()
#-------------------------------------------------------------------------------------------#
