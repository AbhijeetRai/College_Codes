#Set comprehension
st = {i for i in range(5)}
print(st)

st = {i * i for i in range(1, 11) if i % 2 == 0}
print(st)


#Tuple comprehension is not much helpful
st = (i for i in range(5))
print(st)
