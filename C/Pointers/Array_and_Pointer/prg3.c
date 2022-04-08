#include<stdio.h>

void main() {

    int arr[] = {10, 20, 30, 40, 50};
    int *ptr = arr + 2;
    printf("*ptr is %d\n", *ptr);

    ptr = arr + 4;
    printf("*ptr is %d\n", *ptr);
}