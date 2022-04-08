class Lokmanya:

    work = "Lead People"

    def showBirthPlace(self):
        print('Pune')

    def showWorkPlace():
        print('Maharastra')


class Gandhi(Lokmanya):

    def __init__(self):
        pass 

# Parent's static variable, static and instance method will be inherited, even if Parent's constructor is not called
# But if parent's constructor is not called, its instance variable will not be inherited

print(Gandhi.work)
print(Gandhi().work)
Gandhi().showBirthPlace()
Gandhi.showWorkPlace() 