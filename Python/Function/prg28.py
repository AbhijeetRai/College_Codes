ls = list()
st = set()
dt = dict()

def group():

    def friend():
        for i in range(int(input("Enter number of friends\n"))):
            ls.append(input("Enter name of friend nibba\n"))

    def hobby():
        for i in range(int(input("Total hobby\n"))):
            st.add(input("Enter hobby"))

    def collection():
        for i in range(int(input("Total collection\n"))):
            key = input("Enter key\n")
            value = int(input("Enter value\n"))
            dt[key] = value

    friend()
    hobby()
    collection()

group()
print(ls,st,dt,sep="\n")
