#include<stdio.h>

void main() {

    #if (1 > 11)
        printf("Statement 1\n");
        printf("Statement 2\n");
        printf("Statement 3\n");

    #else 
        printf("Statement 4\n");
        printf("Statement 5\n");
        printf("Statement 6\n");    

    #endif

    if(1 > 11) 
        printf("Statement 7\n");
        //printf("Statement 8\n");
        //printf("Statement 9\n");

    else 
        printf("Statement 10\n");
        printf("Statement 11\n");
        printf("Statement 12\n");
}