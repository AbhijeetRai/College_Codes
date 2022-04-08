mere_dost = {"Sahil", "Adya",}

#symmetric_difference of set can accept list as argument
print(mere_dost.symmetric_difference(["Rajat", "Advait", "Adya"]))

#symmetric_difference of set can accept set as argument
print(mere_dost.symmetric_difference({"Sahil", "Sukhdeep"}))

#symmetric_difference of set can accept tuple as argument
print(mere_dost.symmetric_difference(("Chhoti_Didi", "Mommy")))

#symmetric_difference of set can accpet dictionary as argument but will unify only keys of dictionary.
print(mere_dost.symmetric_difference({5 : "yayatee", "7" : "Robin"}))


print(type({1, 2, 3}.symmetric_difference([3, 4, 5])))
print({1, 2, 3}.symmetric_difference([3, 4, 5]).symmetric_difference((5, 6)))
