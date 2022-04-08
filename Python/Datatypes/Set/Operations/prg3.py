mere_dost = {"Sahil", "Adya",}

#intersection of set can accept list as argument
print(mere_dost.intersection(["Rajat", "Advait", "Adya"]))

#intersection of set can accept set as argument
print(mere_dost.intersection({"Sahil", "Sukhdeep"}))

#intersection of set can accept tuple as argument
print(mere_dost.intersection(("Chhoti_Didi", "Mommy")))

#intersection of set can accpet dictionary as argument but will unify only keys of dictionary.
print(mere_dost.intersection({5 : "yayatee", "Sahil" : "Adya"}))


print(type({1, 2, 3}.intersection([3, 4, 5])))
print({1, 2, 3}.intersection([3, 4, 5]).intersection((3, 5, 6)))
