print(10,5) #10 and 5 will be printed with space in between and cursor moves to next line
print(10,5,end="") #10 and 5 will be printed with space in between and cursor stays on same line

print()

print(10,5,sep=":") #10 and 5 spereated with colon
print(10,sep=":") #there is nothing to sepreate from 10 and cursor moves to next line

'''
there is only one value 10 and there is nothing to sepreate it from
cursor stays on same line
'''
print(10,sep=":",end=" ")
