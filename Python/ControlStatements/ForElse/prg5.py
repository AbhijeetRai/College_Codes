jerNo = [45,18,7,28]
pName = ["RS","VK","MSD","Shreyas"]


for x in jerNo:
	print(x,pName[jerNo.index(x)])
else:
	print('All iteration done')

print()

count=0
for x in jerNo:
	print(x,pName[count])
	count+=1
else:
	print('All iteration done')


#else worked with for each and normal for too