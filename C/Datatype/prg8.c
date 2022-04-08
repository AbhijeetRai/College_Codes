#include<stdio.h>

void main() {
	
	int a;
	int *pointer = &a;
	
	printf("Address of a in integer is %d\n", &a);
	printf("Address of a in hexadecimal is %p\n", &a);

	printf("Value of pointer in integer is %d\n", pointer);
	printf("Value of pointer in hexadecimal is %p\n", pointer);
}
