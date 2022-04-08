apps = ["WhatsApp", ["Play Store", "Play Music"], "FaceBook"]
clone = ["WhatsApp", ["Play Store", "Play Music"], "FaceBook"]

print('id of apps is', id(apps))
print('id of clone is', id(clone))

print()

# apps and clone act like a deep copy, but temporaily content is same
# so address of both will same according to rule of python
for i in range(len(apps)):
	print(id(apps[i]), id(clone[i]))

print()

clone[0] = "Instagram";
clone[1][1] = "YouTube";
print('apps is', apps)
print('clone is', clone)


print("--------------------------------------------------------------------")


from copy import deepcopy
apps = ["WhatsApp", ["Play Store", "Play Music"], "FaceBook"]
clone = deepcopy(apps)

print('id of apps is', id(apps))
print('id of clone is', id(clone))

print()

# apps and clone are deep copy, but temporaily content is same
# so address of both will same according to rule of python
for i in range(len(apps)):
	print(id(apps[i]), id(clone[i]))

print()

clone[0] = "Instagram";
clone[1][1] = "YouTube";
print('apps is', apps)
print('clone is', clone)
