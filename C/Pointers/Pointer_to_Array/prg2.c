#include<stdio.h>

void main() {
	
	int arr[] = {10, 20, 30, 40};

	int *ptr1 = arr;							//pointer to 0th element of array
	int (*ptr2)[4] = &arr;							//pointer to whole array

	printf("%ld %ld\n", sizeof(ptr1), sizeof(ptr2)); 			//sizeof any pointer is 8 bytes
	
	//ptr1 is looking at integer, ptr2 is looking at entire array
	printf("%ld %ld\n", sizeof(*ptr1), sizeof(*ptr2));

	//ptr1 was looking towards 0th element of array.
	//On dereferencing ptr1 we got 10.
	printf("%d\n", *ptr1);

	//ptr2 was looking towards whole array.
	//On dereferencing ptr2 we got base address of array
	printf("%p\n", *ptr2);
}
