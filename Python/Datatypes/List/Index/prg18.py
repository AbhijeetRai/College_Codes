# L.insert(index, object)

meme_pages = ['RVCJ', 'Lauhging Colors', 'Logic Humor']
meme_pages.insert(1, 'Be Like Bro')
print(meme_pages)

'''
extend(...) -> L.extend(iterable) -> None -- extend list by appending elements from the iterable
Elements from iterable will be appended at last, one by one, not whole list.
'''

#extended but one by one
meme_pages.extend(['Dank Memes', 'Doge Memes'])
print(meme_pages)

meme_pages.extend(('Cheems', 'Tom and Jerry CheesePosting'))
print(meme_pages)

meme_pages.extend({'RVCJ Bihar', 'RVCJ Punjab'})
print(meme_pages)