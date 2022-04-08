#include<stdio.h>

void main() {

	int arr[] = {1, 2, 3, 4, 5};

	//5++;				//lvalue required
	//&arr[0]++;		//lvalue required
	//arr++;			//lvalue required

	int *ptr = arr;
	ptr++;
}