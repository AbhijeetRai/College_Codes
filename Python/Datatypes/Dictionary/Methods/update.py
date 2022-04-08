wcteam = {24 : "Ganguly", 37 : "Kumble", 19 : "Dravid"}
young = {12 : "Yuvraj", 3 : "Harbhajan"}

wcteam.update(young)
print(wcteam)

wcteam.update(winner = 'AUS', coach = 'chappel')
print(wcteam)

print()

wc2007 = {10 : "Sachin", 19 : "Rahul"}
wc2007.update({48 : "Raina", 36 : "Shreesant"}, captain = "MSD", coach = "NoCoach", manager = 'Rajput')
print(wc2007)
