class Monument :

    name = "Palace of Versailles"
    city = "in Versailles"

    def display(nation, self):
        print(nation)
        print(nation.name, nation.city)
        print(self)

Versailles_palace = Monument()
Versailles_palace.display("France")