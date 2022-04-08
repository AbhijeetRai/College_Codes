#include <stdio.h>

#define a 10
#define b 20

void main() {

    #if a < 20
        printf("a is less than 20\n");

    #endif 

    #if b < 30 
        printf("b is less than 30\n");

    #else 
        printf("b is more than 30\n");

    #endif
}