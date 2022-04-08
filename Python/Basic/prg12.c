#include<stdio.h>

void fun(int a);
void fun(float f);

void main() {

	fun(10);
	fun(10.5f);
}

void fun(int a) {

	printf("In fun int");
}

void fun(float f) {

	printf("In fun float");
}