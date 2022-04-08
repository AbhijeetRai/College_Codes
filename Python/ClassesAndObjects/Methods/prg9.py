class HistoricalMonument:

    maintainer = 'ASI'  # Archaelogical survey of India 

    @classmethod
    def show_maintainer(cls, monument):
        print('Maintainer of', monument, 'is', cls.maintainer)


HistoricalMonument().show_maintainer('Hampi Temple')
HistoricalMonument.show_maintainer('Bhangarh fort')