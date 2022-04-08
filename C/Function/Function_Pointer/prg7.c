#include<stdio.h>

void fun() {
	
	printf("In fun\n");
}

void main() {
	
	void (*fptr)() = fun;
	printf("%p %p %p\n", *fptr, fptr, fun);
}
