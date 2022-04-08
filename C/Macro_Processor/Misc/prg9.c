#include<stdio.h>

#define value 10

void main() {

    #ifdef value
        printf("Defined\n");

    #else 
        printf("Not Defined\n");

    #endif
}