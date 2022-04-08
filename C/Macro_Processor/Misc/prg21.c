#include <stdio.h>
#define value 40

void main() {

    #if value > 30 && 4 % 2 == 0
    printf("True\n");

    #else 
    printf("False\n");

    #endif
}