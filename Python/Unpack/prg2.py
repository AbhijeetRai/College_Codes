#---------------------------------------------------------------------------------------#
ls = [str (x) for x in [1, 2, 3]]						#List - List					|
print(ls)

ls = [int (x) for x in {'11', '22'}]					#List - Set						|
print(ls)

ls = [chr (x) for x in (65, 66)]						#List - Tuple					|
print(ls)

ls = [int (x) for x in {'7' : "MSD", '10' : "Sachin"}]	#List - Dictionary				|
print(ls)

ls = [ord(x) for x in 'Abhi']
print(ls)												#List - String					|

from array import array
a = array('i', [101, 202, 303])
ls = [str(x) for x in a]
print(ls)												#List - Array					|

print()
#---------------------------------------------------------------------------------------#
st = {ord (val) for val in ['A', 'B']}					#Set - List						|
print(st)

st = {chr (x) for x in {66, 67}}						#Set - Set						|
print(st)

st = {int (val) for val in ('22', '6')}					#Set - Tuple					|	# Only list and set were giving required result, not tuple
print(st)																					# As set and dictionary have same '{}', so we cannot do dictionary.

st = {str (x) for x in {7 : "MSD", 10 : "Sachin"}}		#Set - Dictionary				|
print(st)

st = {ord(x) for x in 'Abhi'}
print(st)												#Set - String					|

from array import array
a = array('i', [101, 202, 303])
st = {str(x) for x in a}
print(st)												#Set - Array					|

print()
#---------------------------------------------------------------------------------------#
tp = (chr (val) for val in [89, 90])					#Tuple - List					|
print(tp)

tp = (str (x) for x in {1, 2})							#Tuple - Set					|
print(tp)

tp = (ord (x) for x in ('A', 'B'))						#Tuple - Tuple					|
print(tp)

tp = (int (x) for x in {'7' : "MSD", '10' : "Sachin"})	#Tuple - Dictionary				|
print(tp)

tp = (ord(x) for x in 'Abhi')
print(tp)												#Tuple - String					|

from array import array
a = array('i', [101, 202, 303])
tp = (str(x) for x in a)
print(tp)												#Tuple - Array					|
#---------------------------------------------------------------------------------------#
