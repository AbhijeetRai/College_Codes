class Lokmanya:

    def showName(self):
        print('Lokmanya') 

    def introduce(self):
        self.showName() 

class Gandhi(Lokmanya):

    
    def showName(self):
        print('Gandhi')
    
g1 = Gandhi()
g1.introduce()          # introduce Lokmanya se inherit ho gaya hai, ab  intorduce k andar showName ko call hai 
                        # ab g1 ko chaie ki apne andar dekhe ki mere pass showName hai kyaa, if hai to use call kare
                        # else nahi hai to, Lokmanya k showName ko call kare
l1 = Lokmanya()
l1.introduce()