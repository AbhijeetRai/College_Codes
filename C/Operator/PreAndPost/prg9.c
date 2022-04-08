#include<stdio.h>

void main() {

        int a = 11;
        int b = 4;

        b = ++b + ++b + ++b + ++b;
        printf("%d\n",b);

        a = ++a + ++a + ++a + ++a;
        printf("%d\n",a);
}
