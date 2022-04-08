apps = ["WhatsApp", ["Play Store", "Play Music"], "FaceBook"]
clone = apps

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