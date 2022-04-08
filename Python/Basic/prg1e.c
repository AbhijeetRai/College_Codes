#include<stdio.h>

void fun();

int a = 10;

void main() {

	int b = 5;
	printf("%d\n",a);
	fun();

	printf("%d\n",a);
	printf("%d\n",b);
}

void fun() {

	int b = 20;

	b = b + 1;
	a = a + 1;
}