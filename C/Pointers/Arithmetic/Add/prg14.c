#include <stdio.h>

void main() {

    int a[] = {10, 20, 30, 40, 50};
    
    int *ptr = &a[0];
    ptr = ptr + 1;
    printf("%d\n", *ptr);

    //both are same

    int *pointer = &a[0] + 1;
    printf("%d\n", *ptr);
}