'''
Float is call by value
'''
def function(d):

    print('In Function before change',d,id(d)) #10.5 6336
    d = 20.5
    print('In function after change',d,id(d))  #20.5 6744

a = 10.5
print('Before calling funcion',a,id(a)) #10.5 6336
function(a)
print('After calling function',a,id(a)) #10.5 6336
