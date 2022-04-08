dict = {18:"VK", 10:"ST", 7:"MSD", 0:"VS"}

print(dict,type(dict))

#keyerror if no key as 18 is found
print(dict[18])


#adding elements

dict[1] = "GG"
print(dict)

print(dict[1])


del dict[18]

print(dict)