#include<stdio.h>

void main() {

    int iarr[] = {10, 20, 30, 40};
    char carr[] = {'A', 'B', 'C', 'D'};

    void *vptr1 = iarr;
    void *vptr2 = carr;

    vptr1 = (int *)vptr1 + 1;
    vptr2 = (char *)vptr2 + 1;

    printf("%d\n", *(int *)vptr1);
    printf("%c\n", *(char *)vptr2);
}