#include<stdio.h>

void main() {
	
	int a = 10;
	int b = 20;

	int *ptr1 = &a;
	int *ptr2 = &b;

	ptr1 * 65;
	ptr1 * 'A';
	ptr1 * 65.00;
	ptr1 * ptr2;

	ptr1 / 65;
	ptr1 / 'A';
	ptr1 / 65.00;
	ptr1 / ptr2;
}

/**
 * Divison and multiplication of pointer is not supported
 */
