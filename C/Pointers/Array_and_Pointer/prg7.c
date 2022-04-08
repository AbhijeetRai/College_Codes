#include<stdio.h>

void main() {

    int a[] = {1, 2};
    int b[] = {3, 4, 5};
    int c[] = {6, 7, 8, 9};
    int d[] = {10, 11, 12, 13, 14};

    printf("Array a addressing scheme %p %p\n", &a[0], &a[1]);
    printf("Array b addressing scheme %p %p %p \n", &b[0], &b[1], &b[2]);
    printf("Array c addressing scheme %p %p %p %p\n", &c[0], &c[1], &c[2], &c[3]);
    printf("Array d addressing scheme %p %p %p %p %p\n", &d[0], &d[1], &d[2], &d[3], &d[4]);

    printf("\n");

    //Using '&b' and incrementing it is skipping entire 'b' array and moving to array 'c' base address.
    //As array 'b' and array 'c' are in continuous memory allocation. It would not have jumped to 'c' array.
    //If there would have been some gap between array 'b' and array 'c'.
    printf("%p\n", &b + 1);

    int *ptr = &b + 1;
    printf("%d\n", *ptr);
}