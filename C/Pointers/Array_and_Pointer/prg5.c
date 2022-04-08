#include <stdio.h>

int main(void) {

	int arr[] = {10, 20, 30, 40, 50};

	printf("Base address of a is %p\n", arr);

	//Here a character pointer is trying to accomodate an integer address, thus we will get warning.
	char *ptr1 = &arr[0];

	//Even though we have stored address of an integer in ptr1. ptr1 is "character pointer". It will get incremented by 1 byte only.
	//However, if use address(of type int) directly, address will be incremented by 4 bytes.
	printf("%p %p\n", ptr1 + 1, &arr[0] + 1);

	//Here an integer pointer is trying to accomodate an entire array address, thus we will get warning.
	int *ptr2 = &arr;

	//It is same as base address as of now.
	printf("%p %p %p %p\n", ptr2, &arr, arr, &arr[0]);

	//Even if ptr2 is holding address of array, it will be incremented by 4 bytes only from base address. Because it is integer pointer.
	//But directly using address of array will skip the array, by moving ahead 20 bytes (size of array arr) when incrementing it.
	printf("%p %p\n", ptr2 + 1, &arr + 1);
}
