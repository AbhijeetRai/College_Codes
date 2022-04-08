#include<stdio.h>

void main() {

        int b = 10;
        int *a = &b;
        printf("%d\n", *a);

        int c = 20;
        a = &c;
        printf("%d\n", *a);
}
