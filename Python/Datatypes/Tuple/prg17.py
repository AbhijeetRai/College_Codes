tuple = ("Pubmatic","GsLab","Persistent","QuickHeal",[10,"Shashi",10.5])

#Type error - tuple object does not support item assignment
#tuple[1] = "Hi"

#type error - tuple object does not support item deletion
#del tuple[2]

print(tuple[4])
print(tuple[4][2])

#error - because we are trying to delete,item of tuple
#del(tuple[4])

#AttributeError - str object has no attribute clear
#tuple[1].clear()

#because now we are changing list now tuple
tuple[4].insert(6,"Kanha")
print(tuple)