'''
Trying to avoid
avoid change in dictionary, list, set, outside function
copy them in another variable
'''

def function(ls,st,dc):
    ls,st,dc
    ls.append(4)
    st.add(4)
    dc[18] = " VK"

ls = [1,2,3]
st = {1,2,3}
dc = {7:"MSD",10:"Tendulkar"}
function(ls,st,dc)
print(ls)
print(st)
print(dc)
