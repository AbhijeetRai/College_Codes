'''
  discard(...)
      Remove an element from a set if it is a member.
      If the element is not a member, do nothing.

  pop(...)
      Remove and return an arbitrary set element.
      Raises KeyError if the set is empty.

  remove(...)
       Remove an element from a set; it must be a member.
       If the element is not a member, raise a KeyError.
'''

st = {2, 4, 6}
print(st)
print(st.pop())
print(st)

print()

st = {2, 4, 6}
#print(st.remove(3)) if element not found, raise a KeyError
print(st.remove(4))
print(st)

print()

st = {2, 4, 6}
print(st.discard(3))   #if an element not found, do nothing
print(st.discard(4))
print(st)
