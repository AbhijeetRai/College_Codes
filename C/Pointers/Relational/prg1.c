#include<stdio.h>

void main() {
	
	int a[] = {10, 20, 30, 40, 50};
	
	int *ptr1 = &a[0];
	int *ptr2 = &a[1];

	printf("%d\n", ptr1 == &a[0]);
	printf("%d\n", ptr1 != ptr2);
	printf("%d\n", ptr1 <= ptr2);
	printf("%d\n", ptr2 >= ptr1);
}	
