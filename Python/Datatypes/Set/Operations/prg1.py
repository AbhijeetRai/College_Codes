mere_dost = {"Sahil", "Adya",}

#Union of set can accept list as argument
print(mere_dost.union(["Rajat", "Advait", "Adya"]))

#Union of set can accept set as argument
print(mere_dost.union({"Sahil", "Sukhdeep"}))

#Union of set can accept tuple as argument
print(mere_dost.union(("Chhoti_Didi", "Mommy")))

#Union of set can accpet dictionary as argument but will unify only keys of dictionary.
print(mere_dost.union({5 : "yayatee", "7" : "Robin"}))


print(type({1, 2, 3}.union([3, 4, 5])))
print({1, 2, 3}.union([3, 4, 5]).union((5, 6)))
