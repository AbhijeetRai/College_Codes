# String anagram code in python

str1 = input("Enter string1 ")
str2 = input("Enter string2 ")

ls1 = list(str1)
ls2 = list(str2)

ls1.sort()
ls2.sort()

str1 = "".join(ls1)
str2 = "".join(ls2)

print("Anagram") if (str1 == str2) else print("Not Anagram")
