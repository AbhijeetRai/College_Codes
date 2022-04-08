#include<stdio.h>

void main() {

        int iarr[3];    //without '{}' garbage values are stored
        for(int i = 0; i < 3; i++)
                printf("%d ", iarr[i]);
        printf("\n");

        char carr[3];   //without '{}' garbage values are stored
        for(int i = 0; i < 3; i++)
                printf("%d ", carr[i]);         //unprintable characters to check the ascii use %d, %c to check actual character
        printf("\n");

        float farr[3];  //without '{}' garbage values are stored
        for(int i = 0; i < 3; i++)
                printf("%f ", farr[i]);
        printf("\n");

        long larr[3];   //without giving '{}' garbage values are stored
        for(int i = 0; i < 3; i++)
                printf("%ld ", larr[i]);
        printf("\n");

        double darr[3];         //without giving '{}' garbage values are stored 
        for(int i = 0; i < 3; i++)
                printf("%lf ", darr[i]);
        printf("\n");
}
