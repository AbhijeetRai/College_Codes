#include <stdio.h>

void main() {
	
	int arr[] = {1, 2, 3, 4, 5};
	int *ptr1 = &arr[4];
	

	for(int i = 0; i < 5; i++)
		printf("%d %d\n", arr[i], i[arr]);			//arr[i] is same as i[arr]
	printf("\n");

	for(int i = 0; i < 5; i++)
		printf("%d %d\n", arr[i], *(arr + i));			//arr[i] is stored as *(arr + i) internally
	printf("\n");

	for(int i = 0; i < 5; i++)
		printf("%d %d\n", *(ptr1 - i), *(&arr[4] - i));		//ptr1 = &a[4], directly using address
}
