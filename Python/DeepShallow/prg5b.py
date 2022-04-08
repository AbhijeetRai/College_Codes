'''
Shallow copy me 'data change mayne' rakhta hai, 
kyaa add hua, kyaa remove hua, nahi.
'''


from copy import copy


ls = [1, 2, 3, 4]
ls1 = copy(ls)

del(ls[0])
ls.pop()
ls.pop(1)

ls1.append(3)
ls1.append((1, 3))
ls1.extend({7 : 'MSD', 10 : 'Sachin'})

print(ls)
print(ls1)



st = {1, 2, 3}
st1 = copy(st)

st.remove(1)
st1.add(4)

print(st)
print(st1)


dc = {7 : "MSD", 10 : "Sachin"}
dc1 = copy(dc)

del dc[10]
dc1[12] = "Yuvraj"

print(dc)
print(dc1)
