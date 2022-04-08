#include <stdio.h>

#define a 10

void main() {

    #ifndef a
        printf("a is not defined\n");

    #else
        printf("a is defined\n");

    #endif
}