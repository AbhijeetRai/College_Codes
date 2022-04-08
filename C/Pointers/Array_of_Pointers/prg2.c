#include<stdio.h>

void main() {

    int a = 10, b = 20, c = 30;
    int *ptr1 = &a, *ptr2 = &b, *ptr3 = &c;

    //If I want to store int, then I write int arr[]
    //Now, I have to store int *, then I'll write int* arr[]

    int* arr[] = {ptr1, ptr2, ptr3};

    for(int i = 0; i < 3; i++) {

        printf("%d ", *arr[i]);             //arr[i] = *(arr + i)
        printf("%d ", **(arr + i));
    }
    printf("\n");
}