class Monument :

    name = "Bastille"
    location = "in Paris, France"

    #instance automatically sent to constructor
    def __init__(self):
        print('Constructor')

#Constructor automatically called when instance made
Monument()
bastille = Monument()