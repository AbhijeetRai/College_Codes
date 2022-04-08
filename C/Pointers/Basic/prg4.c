#include<stdio.h>

void main() {

        int a = 10;
        int* ptr = a;   //not '&a' but 'a'
        printf("%d\n", *ptr);   //difficulty while de-referencing
}
