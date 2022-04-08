import array

ls = [1,2,3]

arr = array.array('i',ls)
print(type(arr))
print("array is : ",arr)

for i in arr:
    print(i)
print()

for i in range(len(arr)):
    print(arr[i])
