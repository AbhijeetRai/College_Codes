/**
 * A program to demonstrate, any type of pointer, can hold address of any type of variable 
 * at the expense of a "WARNING" only, if pointer type and variable type do not match.
 */

#include<stdio.h>

void main() {
	
	int a = 10;
	int *intPointer = &a;
	char *charPointer = &a;

	printf("Value of a by a itself %d\n", a);
	printf("Value of a by Integer Pointer %d\n", *intPointer);
	printf("Value of a by Character Pointer %d\n", *charPointer);

	printf("\n");

	printf("Address of a by a itself %p\n", &a);
	printf("Address of a by Integer Pointer %p\n", intPointer);
	printf("Address of a by Character Pointer %p\n", charPointer);
	
	printf("\n");

	printf("Address of a by a itself %d\n", &a);
	printf("Address of a by Integer Pointer %d\n", intPointer);
	printf("Address of a by Character Pointer %d\n", charPointer);
}
