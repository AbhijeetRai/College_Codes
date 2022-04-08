#include<stdio.h>

void main() {

        int a = 5;
        int b = 8;

        b = b++ + ++a;
        printf("%d\n",b);

        a = ++a + b++;
        printf("%d\n",a);
}
