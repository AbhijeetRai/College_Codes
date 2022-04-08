'''
- Call by value and call by reference

 * When integer, float are sent it is call by value		    (immutable) (change at different address)
 * When list, "set" and dictionary are sent it is call by reference (mutable) (change in same address)
'''

'''
Call by value - value of actual parameters are copied in formal parameters of function say(f1), if there is change in value of
                formal parameters of function f1. That change is limited only till f1 not outside

Call by refernce - address of the actual parameters are copied in formal parameters of function f1.
                   Change is visible outside f1.
'''

def function(d):

    '''
    We know that int is passed using call by value, but address of 'a' and 'd' is same because their content is same
    In memory management of "PYTHON", if content is same, address turns out to be same.
    '''
    print('In function before change : ',d,id(d))  #10 4784

    d = 20
    '''
    Once the cotent of d differs, it's address differs too.
    '''
    print('In function after change : ',d,id(d))    #20  5104


a = 10
print('Before function call : ',a,id(a)) #10  4784
function(a)
print('After function call : ',a,id(a))   #10 4784
