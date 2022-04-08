#include<stdio.h>

void main() {

    int a = 10;
    void *ptr1 = &a;
    int *ptr2 = ptr1;               //implicit typecasting
    int *ptr3 = (int *)ptr1;        //explicit typecasting (no need of it, though)

    printf("Address of a is %p %p %p %p\n", &a, ptr1, ptr2, ptr3);
    printf("Value of a is %d %d %d %d\n", a, *(int *)ptr1, *ptr2, *ptr3);
}