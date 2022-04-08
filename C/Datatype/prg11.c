#include<stdio.h>

void main() {

	int a = 10;
	void *pointer = &a;

	printf("Value of a by itself is %d\n", a);
	printf("Value of a by void pointer is %d\n", *pointer);
}
