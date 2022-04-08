#include <stdio.h>

void fun() {
	
	printf("In fun");

	int a = 2;
	int b = 3;
	int c = a + b;
}

void main() {
		
	void (*fptr)() = fun;
	void (*fptr1)(void) = &fun;
	//name of the function is address of first instruction
	printf("%p %p %p\n", fun, fptr, fptr1);

	printf("%ld %ld %ld\n", sizeof(fun), sizeof(*fptr), sizeof(*fptr1));
}
