'''
IndexError : Occurs when string has an extra placeholder and we didn’t pass any value for it in the format() method.
Python usually assigns the placeholders with default index in order like 0, 1, 2, 3…. to acces the values passed as parameters.
So when it encounters a placeholder whose index doesn’t have any value passed inside as parameter, it throws IndexError.
'''

print('I stay in {} since {}'.format('Dhayari'))
