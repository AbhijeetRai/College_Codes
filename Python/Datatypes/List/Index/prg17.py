memes = ['Bro', 'Meme Man', 'Karen']

memes.append('Oyo')     #Bro, Meme Man, Karen, Oyo
print(memes)            

dogs = ['Doge', 'Cheems']

memes.append(dogs)
print(memes)            # [ Bro, Meme Man, Karen, Oyo, [Doge, Cheems] ]

"""
Whatever we append at end of list, is appeneded as it is. 
Tupple will be appended as tuple in list.
List will be appended as list
"""

st = {'RVCJ', 'Lauhging Colors'}
memes.append(st)
print(memes)

platforms = {'meme' : 'Reddit / Tumblr', 'photos' : "Instagram"}
memes.append(platforms)
print(memes)