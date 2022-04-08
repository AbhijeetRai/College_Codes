//Returning array from a function

#include <stdio.h>

int arr[] = {10, 20, 30, 40};

int* fun() {
	
	printf("In fun\n");
	return arr;
}

//Send pointer, receive pointer

void main() {
	
	int *ptr = fun();

	for(int i = 0; i < 4; i++)
		printf("%d ", *(ptr + i) );
	printf("\n");
	
	//Function pointer to function, that takes no parameters and returns an address of integer (array)
	int *(*fptr)() = fun;
	fptr();
}
