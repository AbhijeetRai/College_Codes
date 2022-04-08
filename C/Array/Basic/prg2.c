#include<stdio.h>

void main() {

	int arr[3] = {1, 11.1123, 'A'};

	for(int i = 0; i < 3; i++)
		printf("%d ", arr[i]);

	printf("\n");

	float ar[3] = {1.14, 2, 'C'};

	for(int i = 0; i < 3; i++)
		printf("%f ", ar[i]);

	printf("\n");

	char a[3] = {65, 66.964, 'C'};

	for(int i = 0; i < 3; i++)
		printf("%c ", a[i]);

	printf("\n");
}

/**
 * Array is co-operative. Every data type is accepting every other data
 type but with own conditions, type casting and loss of data.
 */
