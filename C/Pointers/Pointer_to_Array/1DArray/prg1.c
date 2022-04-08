#include<stdio.h>

void main() {

    int arr[] = {10, 20, 30, 40};
    int *ptr = arr;

    for(int i = 0; i < 5; i++)
        printf("%d %d %d %d\n", arr[i], *(arr + i), *(ptr + i), ptr[i]);

    //It is evident *(ptr + i) is same as ptr[i]
}