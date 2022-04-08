#include<stdio.h>

void main() {

        int *a;
        int b = 10;
        a = &b;
        int *c = &b;

        printf("%d\n", *a);
        *c = 0;
        printf("%d\n", *a);
}
