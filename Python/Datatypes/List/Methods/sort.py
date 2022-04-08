#Sorts in increasing alphabetic order
apps = ["FaceBook", "WhatsApp", "Contacts", "Wynk"]
apps.sort()
print(apps)

#Sorts in decreasing alphabetic order
apps = ["FaceBook", "WhatsApp", "Contacts", "Wynk"]
apps.sort(reverse = True)
print(apps)

#Sorts in increasing order of length, if length is same, element inserted first will be stored first
apps = ["FaceBook", "WhatsApp", "Contacts", "Wynk"]
apps.sort(key = len)
print(apps)

#sorts in decreasing order of length. If length is same, element that came first will be stored first
apps = ["FaceBook", "WhatsApp", "Contacts", "Wynk"]
apps.sort(key = len, reverse = True)
print(apps)