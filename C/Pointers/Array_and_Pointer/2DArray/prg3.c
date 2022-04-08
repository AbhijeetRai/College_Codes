//Addressing scheme of 3D Array

#include<stdio.h>

void main() {
	
	int arr[][3] = {1, 2, 3, 4, 5, 6, 7, 8, 9};

	for(int i = 0; i < 3; i++) {
		
		for(int j = 0; j < 3; j++)
			printf("%p ", &arr[i][j]);
		printf("\n");
	}
	printf("\n");

	int a[3][3] = {10, 20, 30, 40, 50, 60, 70, 80, 90};

	for(int i = 0; i < 3; i++){
		
		for(int j = 0; j < 3; j++)
			printf("%p ", &a[i][j]);
		printf("\n");
	}
}
