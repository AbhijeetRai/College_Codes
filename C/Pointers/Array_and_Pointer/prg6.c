#include <stdio.h>

void main() {

    int arr[] = {10, 20, 30, 40};

    int *ptr = &arr[1];
    printf("%d\n", *ptr);
    //We can use '*' directly with address also
    printf("%d\n", *&arr[1]);
}