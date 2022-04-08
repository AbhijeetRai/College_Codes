'''
creating array using linspace

 - linspace fuction is used to create an array with evenly space points between starting and ending point

 - numpy.linspace(start, stop, num, endpoint, return step, d-type)

 start - starting value of sequence
 stop  - ending value of sequence
 num   - number of sample to generate

 end point - if endpoint value is true, stop parameter is last sample (true by default)
 return step - if return step value is true, returns elements and 'step'
 d type - data type
'''

from numpy import linspace

a = linspace(2,3,num=5)
print(a)

a = linspace(2,3,num=5,endpoint=False)
print(a)


a = linspace(2,3,num=5,retstep=True)
print(a)

a = linspace(2,3,num=5, dtype = str)
print(a)