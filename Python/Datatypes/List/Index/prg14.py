s = "Abhi"
print(s[0])
print(s[--0])
print(s[--3])

#print(s[--4])  #index error - string index out of range
#print(s[0][-3]) #index error - string index out of range
#print(s[0][1])  #index error - string index out of range
#print(s[4])      #index error - string index out of range
#print(s[-5])     #IndexError: string index out of range


a = 10
#print(a[1])    #int object is not suscriptable
#print(a[1][0]) #int object is not suscriptable


list1 = ["Rai",22,6.1]
list2 = ["Zagade",list1,23,5.15] #list2 = ["Zagade",["Rai",22,6.1],23,5.15]

print(list2)
print(list1[0][0],list1[-3][-3])
print(list1[0],list1[-3])

#print(list1[-3][0][1]) #IndexError: string index out of range
#print(list1[1][1])     #int object is not subscriptable
#print(list1[-1][1])    #float object is not subscriptable

print(list2[1])
print(list2[1][2])
print(list2[0][0])
print(list2[1][0][0])

#print(list2[1][0][0][2]) #IndexError: string index out of range
#print(list2[0][0][1]) #string index out of range
#print(list2[1][2][0]) #float object is not suscriptable
#print(list2[-2][1]) #TypeError : 'int'object is not subscriptable
