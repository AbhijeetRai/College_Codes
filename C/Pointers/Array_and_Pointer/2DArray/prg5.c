#include<stdio.h>

void main() {

    int arr[3][3] = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    printf("Address of the first element of array %p\n", &arr[0][0]);
    printf("Address of 0th row %p %p\n", &arr[0], arr[0]);
    printf("Array base adress %p %p\n", arr, &arr);

    printf("\n");

    printf("%p %p %p\n", arr[1], &arr[1], &arr[1][0]);
    printf("%p %p %p\n", arr[2], &arr[2], &arr[2][0]);
}