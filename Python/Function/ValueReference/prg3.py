''''
String is call by value
'''
def function(d):

    print('In Function before change',d,id(d))
    d = 'b'
    print('In function after change',d,id(d))

a = 'a'
print('Before calling funcion',a,id(a))
function(a)
print('After calling function',a,id(a))
