#include<stdio.h>

void main() {

    #if 1< 10
        printf("In if 1\n");

    #endif

    if(2 < 20)
        printf("In if 2\n");
}

//only if is supported