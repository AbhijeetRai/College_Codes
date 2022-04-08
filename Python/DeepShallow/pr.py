import copy as cp

tp = (1, [1, 2], {3, 4})
copy = cp.copy(tp)

for i in range(len(tp)):
    print(id(tp[i]), id(copy[i]))

print("\n-------------------------------------------\n")

tp = (1, [1, 2], {3, 4})
copy = cp.deepcopy(tp)

for i in range(len(tp)):
    print(id(tp[i]), id(copy[i]))

'''
If there exists a deep or shallow copy of collection(list or tuple) then, in

deep copy - address of shared mutable collection will be different
shallow copy - address of shared mutable collection will be same 
'''
