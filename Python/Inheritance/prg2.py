class Lokmanya:

    def __init__(self):
        print('Lokmanya constructor')


class Gandhi(Lokmanya):

    def __init__(self):

        print("Gandhi constructor")
        super().__init__()

g1 = Gandhi()

# In Python, constructor of Parent is not called implicitly.
# Hence we called it explicitly
