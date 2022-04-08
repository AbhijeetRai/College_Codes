import io 

fp = open('myfile.txt', 'w')
fp.write('Hello, World!') 
fp.close()

fp1 = open('myfile.txt', 'r')
fp1.seek(5)                         #move cursor to 5th index from beginning
print(fp1.read())

fp1.close()