'''
Dictionary was exactly appended(with key and value) in list (append happens as it is)
(see in prg17.py at last line, in this folder)

Let us see, how dictionary is extended in list.
Extension happens by appending one by one item of iterable
and if that happens, only keys of dictionary will be picked and extended one by one in list
'''

dict = {'memes' : 'Tumblr', 'job' : "LinkedIn"}
ls = ['FB', "IG"]

#only keys were extended
ls.extend(dict)
print(ls)