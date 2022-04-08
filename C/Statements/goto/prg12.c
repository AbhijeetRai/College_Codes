#include<stdio.h>

void fun() {
	
	printf("In fun\n");
}

void main() {
	
	for(int i = 1; i <= 3; i++)
		fun();
}
