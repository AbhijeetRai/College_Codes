class Lokmanya:

    def __init__(self):
        self.event = "Freedom"

class Gandhi(Lokmanya):
    pass 

g1 = Gandhi()
g2 = Gandhi()

print(g1.event, g2.event)
g1.event = "Dandi"
print(g1.event, g2.event)

#Each child object gets unique copy of parent instance variable 