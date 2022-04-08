#include<stdio.h>

void main() {

        int a = 12;
        int b = 13;

        b = b++ + b++;
        printf("%d\n",b);

        a = a++ + a++;
        printf("%d\n",a);

        b = a++ + b++;
        printf("%d\n",b);
}
