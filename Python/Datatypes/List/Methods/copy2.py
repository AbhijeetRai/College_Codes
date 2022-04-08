apps = ["WhatsApp", ["Play Store", "Play Music"], "FaceBook"]
clone = apps.copy()			#shallow copy

print('id of apps is', id(apps))
print('id of clone is', id(clone))

print()

for i in range(len(apps)):
	print(id(apps[i]), id(clone[i]))

print()

clone[0] = "Instagram";
clone[1][1] = "YouTube";
print('apps is', apps)
print('clone is', clone)


print("\n-----------------------------------------------------\n")


from copy import copy
apps = ["WhatsApp", ["Play Store", "Play Music"], "FaceBook"]
clone = copy(apps)			#shallow copy

print('id of apps is', id(apps))
print('id of clone is', id(clone))

print()

for i in range(len(apps)):
	print(id(apps[i]), id(clone[i]))

print()

clone[0] = "Instagram";
clone[1][1] = "YouTube";
print('apps is', apps)
print('clone is', clone)


print("\n-----------------------------------------------------\n")


apps = ["WhatsApp", ["Play Store", "Play Music"], "FaceBook"]
clone = []

for i in apps:
	clone.append(i)	#shallow copy

print('id of apps is', id(apps))
print('id of clone is', id(clone))

print()

for i in range(len(apps)):
	print(id(apps[i]), id(clone[i]))

print()

clone[0] = "Instagram";
clone[1][1] = "YouTube";
print('apps is', apps)
print('clone is', clone)

print("\n------------------------------------------------------\n")

apps = ["WhatsApp", ["Play Store", "Play Music"], "FaceBook"]
clone = list(apps)	#Even unpacking results in shallow copy

print('id of apps is', id(apps))
print('id of clone is', id(clone))

print()

for i in range(len(apps)) :
	print(id(apps[i]), id(clone[i]))

print()

clone[0] = "Instagram"
clone[1][1] = "YouTube"
print('apps is', apps)
print('clone is', clone)