#include <stdio.h>

void main() {

    int a = 10;
    int *ptr = &a;

    int b = 20;
    int *pointer = &b;
    
    //Addition of pointer and pointer is not supported
    int *ansptr = ptr + pointer;
}