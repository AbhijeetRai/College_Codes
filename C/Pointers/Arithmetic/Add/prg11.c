#include<stdio.h>

void main() {

    int a[] = {10, 20, 30, 40, 50};
    int *ptr = &a[1];
    printf("%d\n", *ptr);

    int *pointer = ++ptr;
    //++ptr means
    //ptr = ptr + 1; return ptr
    printf("%d\n", *ptr);
    printf("%d\n", *pointer);
}