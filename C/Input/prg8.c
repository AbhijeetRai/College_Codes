#include<stdio.h>

void main() {
	
	int a;
	int* b = &a;
	int *c = b;
	int *d = c;

	printf("Enter a value\n");
	scanf("%d", d);
	printf("a is %d\n", a);
}
