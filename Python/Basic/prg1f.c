#include<stdio.h>

void fun();

int b = 10;

void main() {

	printf("a   b\n");

	for(int i = 1; i <=10; i++) {

		fun();
	}
}

void fun() {

	int a = 10;

	b = b + 1;
	a = a + 1;

	printf("%d  %d\n",a,b);
}
