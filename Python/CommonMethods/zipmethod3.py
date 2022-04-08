capital = ['Lucknow', 'Patna']
state = ("UP", "Bihar")
cm = {'Yogi' : "M.sc", "Nitish" : "IIT"}

tp = tuple(zip(capital, state, cm))
print(tp)

capital1, state1, cm1 = zip(*tp)
print(capital1)
print(state1)
print(cm1)
