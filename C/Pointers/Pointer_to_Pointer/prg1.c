#include<stdio.h>

void main() {
	
	int a = 10;
	int* ptr = &a;
	int** pointer = &ptr;

	printf("Size of a is %ld\n", sizeof(a));
	printf("Size of ptr is %ld\n", sizeof(ptr));
	printf("Size of pointer is %ld\n", sizeof(pointer));

	printf("\n");

	printf("Value of a is %d %d %d\n", a, *ptr, **pointer);
	printf("Address of a is %p %p %p\n", &a, ptr, *pointer);
	printf("Adress of ptr is %p %p\n", &ptr, pointer);
	printf("Address of pointer is %p\n", &pointer);
}
