def office():

    def project():
        print("Android")
        print("AI")
        return 2

    def promotion():
        print("Manager")
        print("Employee")
        return 2

    noOfproject = project()
    noOfpromotion = promotion()

    return project, promotion

tp = office()

for i in range(len(tp)):
    tp[i]()


print("\n\n")

def player():

    def T20():
        print(5000)

    def Oneday():
        print(10900)

    def perLife():
        print("Anushka DIDI")

    return T20,Oneday,perLife


tp = player()

for i in tp:
    i()
