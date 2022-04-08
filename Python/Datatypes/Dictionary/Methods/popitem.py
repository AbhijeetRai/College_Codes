'''
   popitem(...)
       D.popitem() -> (k, v), remove and return some (key, value) pair as a
       2-tuple; but raise KeyError if D is empty.

'''

wc = {37 : "Kumble", 24 : "Ganguly", 12 : "Yuvraj", 99 : "Sachin", 19 : "Dravid"}
print(wc.popitem())
print(wc)
