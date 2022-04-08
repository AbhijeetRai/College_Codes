#include <stdio.h>

void main() {

    int arr[] = {10, 20, 30, 40, 50};

    for(int i = 0; i < 5; i++)
        printf("%d %d\n", arr[i], *(arr + i));
    printf("\n");

    //if arr[i] = *(arr + i) then,
    //&arr[i] = (arr + i)

    for(int i = 0; i < 5; i++)
        printf("%p %p\n",  &arr[i], arr + i);    
}