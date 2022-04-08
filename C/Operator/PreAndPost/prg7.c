#include<stdio.h>

void main() {

        int a = 5;
        int b = 8;

        b = ++b + ++b + ++b;
        printf("%d\n",b);

        a = ++a + ++a + ++a;
        printf("%d\n",a);
}
