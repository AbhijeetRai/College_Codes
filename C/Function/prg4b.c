//Call by reference
#include<stdio.h>

void swap(int *a, int *b) {

        int temp;

        temp = *a;
        *a = *b;
        *b = temp;
}

void main() {

        int a = 10, b = 20;

        printf("Before swap a is %d b is %d\n", a, b);
        swap(&a, &b);
        printf("After  swap a is %d b is %d\n", a, b);
}
