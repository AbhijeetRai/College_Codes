#include<stdio.h>

void main() {

        int a = 31, b = 0;
        b = b++ + a++ + 1 + --a - a++ + a--;
        printf("%d\n", b);
        printf("%d\n", a);
}
