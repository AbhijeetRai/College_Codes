cricket = {7 : "MSD", 10 : "Sachin"}
football = {'7' : "CR7", "10" : "Messi"}

print(list(zip(cricket, football)))

crickters = ("Mahendra Singh Dhoni", "Sachin Ramesh Tendulkar")
print(set(zip(cricket, crickters)))
print(dict(zip(cricket, crickters)))

print(type(zip(cricket, football)))
