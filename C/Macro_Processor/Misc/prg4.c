#include<stdio.h>

void main() {

    //presence of parentheses does not make any difference
    #if (10 < 20)
        printf("In if 1\n");

    #else 
        printf("In else 1\n");

    #endif    
}