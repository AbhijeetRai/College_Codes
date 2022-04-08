def personalLife():

    def movie():
        ticket = 200
        popcorn = 100
        return (ticket + popcorn)

    def food():
        chinese = "Chopsy"
        return chinese

    frommovie = movie()
    fromfood = food()

    print('Movie expense is',frommovie)
    print('Dinner menu was',fromfood)

    return movie,food

methods = personalLife()

for i in methods:
    print(i())
