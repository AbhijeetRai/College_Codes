#include <stdio.h>

void main() {

    #if 1 < 10
        printf("In if\n");

    #else 
        printf("In else");

    #endif
}