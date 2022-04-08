class Lokmanya:

    def __init__(self):
        print('Lokmanya constructor')


class Gandhi(Lokmanya):

    def __init__(self):
        print("Gandhi constructor")


g1 = Gandhi()

# Answer is 'Gandhi constructor' only.
# Because, in Python, constructor of Parent is not called implicitly.
