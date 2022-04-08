def arithmetic() :

    def add(x,y):
        print(x+y)

    def sub(x,y):
        print(x-y)

    def mul(x,y):
        print(x*y)

    def div(x,y):
        print(x/y)

    return add,sub,mul,div

tp = arithmetic()
for i in tp:
    i(1,2)

print()

for i in range(len(tp)):
    tp[i](1,2)
