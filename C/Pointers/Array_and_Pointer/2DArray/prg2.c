#include<stdio.h> 

void main() {

	int arr3[2][2] = {1, 2, 4};

	for(int i = 0; i < 2; i++) {

		for(int j = 0; j < 2; j++) 
			printf("%d ", arr3[i][j]);
		printf("\n");
	}
	printf("\n");


	int arr4[2][2] = {1, 2, 3, 4, 5};

	for(int i = 0; i < 2; i++) {

		for(int j = 0; j < 2; j++) 
			printf("%d ", arr4[i][j]);
		printf("\n");
	}
	printf("\n");


	int arr5[][3] = {{1}, {2, 3}, 4};

	for(int i = 0; i < 3; i++) {

		for(int j = 0; j < 3; j++) 
			printf("%d ", arr5[i][j]);
		printf("\n");
	}
	printf("\n");


	int arr6[2][3] = {{1}, {2, 3}, 4};

	for(int i = 0; i < 3; i++) {

		for(int j = 0; j < 3; j++) 
			printf("%d ", arr6[i][j]);
		printf("\n");
	}
	printf("\n");

}