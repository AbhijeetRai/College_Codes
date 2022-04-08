#include<stdio.h>

void main() {
	
	int a[20];

	for(int i = 0; i <= 19; i++)
		printf("%p\n", &a[i]);
}	
