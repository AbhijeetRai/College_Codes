#include<stdio.h>

void main() {

        int a = 10;
        int* ptr = &a;

        printf("%d\n", a); //10
        printf("%p\n", ptr);
        printf("%p\n", &a);
        printf("%d\n", *ptr);
}
