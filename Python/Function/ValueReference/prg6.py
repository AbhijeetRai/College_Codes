'''
Set is call by refernce
'''
def function(d):

    print('In Function before change',d,id(d)) #{1,2,3} 3272
    d.add(4)
    print('In function after change',d,id(d))  #{1,2,3,4} 3272

a = {1,2,3}
print('Before calling funcion',a,id(a)) #{1,2,3} 3272
function(a)
print('After calling function',a,id(a))      #{1,2,3,4} 3272
