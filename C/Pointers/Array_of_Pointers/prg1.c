#include<stdio.h>

void main() {
	
	int a = 10, b = 20, c = 30;
	int* arr[] = {&a, &b, &c};

	for(int i = 0; i < 3; i ++)
		printf("%d ", *arr[i]);
	printf("\n");
}
