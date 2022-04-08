#include <stdio.h>

void main() {

    int a = 10;
    int *ptr = &a;

    if(ptr + 1 == 1 + ptr)
        printf("Pointer addition is cummutative\n");

    else 
        printf("Pointer addition is not cummutative\n");

    ptr - 1;    //valid statement
   // 1 - ptr;    //invalid statement
}