#include<stdio.h>

void main() {
	
	//int arr[2][] = {1, 2, 3, 4};			//only giving row size is not enough.


	int arr1[][2] = {1, 2, 3, 4};			//only giving column size is enough.

	for(int i = 0; i < 2; i++) {

		for(int j = 0; j < 2; j++) 
			printf("%d ", arr1[i][j]);
		printf("\n");
	}
	printf("\n");

	
	int arr2[][2] = {1, 2, 3, 4, 5};

	for(int i = 0; i < 3; i++) {

		for(int j = 0; j < 2; j++) 
			printf("%d ", arr2[i][j]);
		printf("\n");
	}
	printf("\n");


	int arr3[2][2] = {1, 2, 3, 4};

	for(int i = 0; i < 2; i++) {

		for(int j = 0; j < 2; j++) 
			printf("%d ", arr3[i][j]);
		printf("\n");
	}
	printf("\n");	
}
