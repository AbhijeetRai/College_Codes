class Monument:

    name = "The Louvre."
    location = "Paris, France"

    def display(selfie):
        print(selfie.name, selfie.location)


louvre = Monument()

# In python, instances have instance method(s) and constructor(s).
# Whenever instance method or constructor of any instance(object)
# is called (using that instance).
# That object(instance) itself is passed as first argument,
# automatically(implicitly) to constructor / instance method.
# But not accepted by instance method / constructor automatically(implicitly).
# Accept that instance (object) as parameter explicitly with help of
# "CONVENTINAL" keyword 'self'. Any other word can also be used

louvre.display()
