#include<stdio.h>

void main() {
	
	int arr[4] = {10, 20, 30, 40};
	printf("%p\n", arr);			//name of the array & address of the first element in array
	printf("%p\n", &arr[0]);		//are same

	printf("\n");

	float ar[3] = {10.1, 20.1, 30.1};
	printf("%p\n", ar);
	printf("%p\n", &ar[0]);

	printf("\n");

	char a[2] = {'A', 'B'};
	printf("%p\n", a);
	printf("%p\n", &a[0]);
}
