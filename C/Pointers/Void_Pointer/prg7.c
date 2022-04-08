#include<stdio.h>

void main() {

    int iarr[] = {10, 20, 30, 40};
    char carr[] = {'A', 'B', 'C', 'D'};

    void *vptr1 = iarr;
    void *vptr2 = carr;

    int *ptr1 = vptr1;
    char *ptr2 = vptr2;

    ptr1 = ptr1 + 1;
    ptr2 = ptr2 + 1;

    printf("%d\n", *ptr1);
    printf("%c\n", *ptr2);
}