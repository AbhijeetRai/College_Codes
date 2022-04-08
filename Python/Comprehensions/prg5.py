ls = [0 for i in range(5)]
print(ls)

st = {'HI'+str(i) for i in range(5)}
print(st)

ls = [{i + j for j in range(2)} for i in range(3)]
print(ls)

st = [[i + j for j in range (2)] for i in range(2)]
print(st)

#UnHashable type set
#st = {{i + j for j in range(3)}for i in range(3)}
