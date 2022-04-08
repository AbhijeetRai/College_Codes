#include<stdio.h>

void main() {

    int arr[] = {10, 20, 30, 40, 50};

    //name of the array itself, is address of 0th index
    if(arr == &arr[0])
        printf("Name of the array is address of 0th index\n");

    //they both are pointer and address to an "integer"
    printf("%p %p\n", arr, &arr[0]);
    //when we increment array name by 1 or address of 0th index by 1, they will move forward by 4 bytes. (in this case, pointing to int)
    printf("%p %p\n", arr + 1, &arr[0] + 1);
}