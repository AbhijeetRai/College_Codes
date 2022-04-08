mere_dost = {"Sahil", "Adya",}

#difference of set can accept list as argument
print(mere_dost.difference(["Rajat", "Advait", "Adya"]))

#difference of set can accept set as argument
print(mere_dost.difference({"Sahil", "Sukhdeep"}))

#difference of set can accept tuple as argument
print(mere_dost.difference(("Chhoti_Didi", "Mommy")))

#difference of set can accpet dictionary as argument but will unify only keys of dictionary.
print(mere_dost.difference({5 : "yayatee", "7" : "Robin"}))


print(type({1, 2, 3}.difference([3, 4, 5])))
print({1, 2, 3}.difference([3, 4, 5]).difference((5, 6)))
