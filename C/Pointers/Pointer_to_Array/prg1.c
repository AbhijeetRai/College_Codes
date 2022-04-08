#include<stdio.h>

void main() {
	
	int arr[] = {10, 20, 30, 40};
	
	//Pointer to integer, is trying to hold address of entire array
	int *ptr = &arr;

	ptr = ptr + 1;
	//ptr + 1 * sizeof(data type of pointer)
	//ptr + 1 * sizeof(int)
	//ptr + 1 * 4
	//ptr + 4
	//Only traveled ahead by 4 bytes, from (initial) base address


	printf("Base address is %p ptr is at %p\n", &arr, ptr);

	//If you want to move ahead by 16 bytes (here entire size of array), that is skip entire array
	//When one is added to some pointer, use "pointer to array" or use "address of entire array" directly.

	
	int (*pointer)[4] = &arr; 	//pointer to array of 4 integers

	pointer = pointer + 1;
	//pointer + 1 * sizeof(data type of pointer)
	//pointer + 1 * sizeof(int[4])
	//pointer + 1 * 16
	//pointer + 16
	//moved 16 bytes ahead from initial address

	printf("Base address %p\n", &arr);
	printf("Pointer at %p\n", pointer);
	printf("By directly using address of whole array %p\n", &arr + 1);
}
