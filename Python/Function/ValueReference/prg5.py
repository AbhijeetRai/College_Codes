'''
List is call by reference
'''
def function(d):

    print('In Function before change',d,id(d)) #[1,2,3] 2488
    del(d[2])
    print('In function after change',d,id(d))   #[1,2] 2488

a = [1,2,3]
print('Before calling funcion',a,id(a)) #[1,2,3] 2488
function(a)
print('After calling function',a,id(a))      #[1,2] 2488
