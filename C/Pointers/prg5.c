#include<stdio.h>

void main() {

        int b = 25;
        int *pointer = &b;

        int a = 10;
        int *ptr = &a;

        *ptr = 15;              //*ptr used as lvalue
        printf("a is %d and %d\n", a, *ptr);

        *ptr = *ptr + 5;       //*ptr used as rvalue, then lvalue
        printf("a is %d and %d\n", a, *ptr);

        *ptr = a + 5;         //used as lvalue
        printf("a is %d and %d\n", a, *ptr);

        *ptr = b + 5;           //used as lvalue
        printf("a is %d and %d\n", a, *ptr);

        *ptr = *pointer + 10;
        printf("a is %d and %d\n", a, *ptr);
}
