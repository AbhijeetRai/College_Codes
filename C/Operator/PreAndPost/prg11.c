#include<stdio.h>

void main() {

        int a = 3;
        int b = 2;

        b = (++b + b++) * (++a / a++);
        printf("%d\n",b);
}
