'''
now there is no error because, it is splitting three values eg Abhhijet 56 100000 as
'Abhijeet','56', '100000' and there are three variables to catch it
'''

x,y,z = input('Enter name, id and salary\n').split(' ',2)
print('x is ',x,type(x))
print('y is',y,type(y))
print('z is',z,type(z))

name = x
empId = int(y)
salary = float(z)

print('empId is',empId,type(empId))
print('name is',name,type(name))
print('salary is',salary,type(salary))
