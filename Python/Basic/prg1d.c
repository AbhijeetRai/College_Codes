#include<stdio.h>

void fun();

int a = 10;

void main() {

	printf("%d\n",a);
	fun();

	printf("%d\n",a);
	//error for b
	//printf("%d\n",b);
}

void fun() {

	int b = 20;

	b = b + 1;
	a = a + 1;
}