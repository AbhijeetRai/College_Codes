//Passing a function via function pointer.

#include<stdio.h>

void fun(void (*fptr)()) {
	
	fptr();
}

void gun() {
	
	printf("In gun\n");
}

void main() {
	
	fun(gun);
}
