#include<stdio.h>

void main() {
	
	int a = 10;

	int* ptr1 = &a;
	int** ptr2 = &ptr1;
	int*** ptr3 = &ptr2;

	printf("%d\n", ***ptr3);
}
