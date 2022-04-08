def mall():

    def shopping():
        print('Shopping in pantnaloons')

    def spa():
        print('Spend time in spa and saloon')

    def movie():
        print('Go and watch a movie in PVR')

    def food():
        print('Try some food in foodcourt')

    def sportscomplex():
        print('Try cricket on turf')

    return shopping,spa,movie,food,sportscomplex

functions = mall()

choice = int(input('1:Shopping\n2:Spa\n3:Movie\n4:Food\n5:sportscomplex\n'))
functions[choice-1]()
