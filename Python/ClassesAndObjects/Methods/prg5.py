class GrandParent:
    pass 

class Parent(GrandParent):

    def showHead(self):
        print('The head is', self) 

class Child(Parent):
    pass 

class Orphan:
    pass

Parent.showHead(GrandParent())
Parent.showHead(Parent())
Parent.showHead(Child())
Parent.showHead(Orphan())
Parent.showHead(1)