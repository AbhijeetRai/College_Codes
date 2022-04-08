#include<stdio.h>

void main() {

    #if 10 > 20
        printf("Great\n");
        printf("Large\n");

    #elif (10 == 20)                    //bracket is optional
        printf("Same\n");
        printf("Equal\n");

    #else                               //else is optional
        printf("Small\n");
        printf("Tiny\n");

    #endif



    #if 4 % 2 != 0
        printf("Odd\n")

    #elif 4 % 2 == 0
        printf("Even\n");
        printf("Divisible by 2\n");
    
    #endif
}