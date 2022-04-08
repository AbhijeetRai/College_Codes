#include<stdio.h>

void main() {

    if(2 > 3)
        printf("Statement 1\n");
        printf("Statement 2\n");

    #if 2 > 3
        printf("Statement 3\n");
        printf("Statement 4\n");

    #endif
}