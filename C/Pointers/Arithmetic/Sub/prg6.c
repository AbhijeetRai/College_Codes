#include<stdio.h>

void main() {

     int arr[] = {10, 20, 30, 40, 50};
    int *ptr1 = &arr[3];
    int *result = ptr1--;

    printf("%d\n", *ptr1);
    printf("%d\n", *result); 
}