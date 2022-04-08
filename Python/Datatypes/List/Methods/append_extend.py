PM = "Modi"
batsman = ["VK", "Rohit"]
bcc_board = ("Ganguly", "Shah")
playing_11 = {7, 10, 18, 45}
roles = {"WK" : "MSD", "Captain" : "VK"}


india = []
india.append(PM)
india.append(batsman)
india.append(bcc_board)
india.append(playing_11)
india.append(roles)
print(india)
#append as it is

print()

india = []
#india.extend(1) #only iterable object is required
india.extend(PM)
india.extend(batsman)
india.extend(bcc_board)
india.extend(playing_11)
india.extend(roles)
print(india)
#extend means, take value from iterable one by one and add to end of list
#only key of dictionary was appended
