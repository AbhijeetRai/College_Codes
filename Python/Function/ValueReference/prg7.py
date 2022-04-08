'''
Dictionary is call by refernce
'''
def function(d):

    print('In Function before change',d,id(d))  #{7:"MSD",10:"Tendulkar"} 3600
    del(d[10])
    print('In function after change',d,id(d))   #{7:"MSD"} 3600

a = {7:"MSD",10:"Tendulkar"}
print('Before calling funcion',a,id(a)) #{7:"MSD",10:"Tendulkar"} 3600
function(a)
print('After calling function',a,id(a)) #{7:"MSD"} 3600
