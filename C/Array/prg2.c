#include<stdio.h>

void main() {

        int iarr[3] = {};  //initialised with value 0
        for(int i = 0; i < 3; i++)
                printf("%d ", iarr[i]);
        printf("\n");

        char carr[3] = {'A'}; //blank spaces initialised with '\0'
        for(int i = 0; i < 3; i++)
                printf("%d ", carr[i]); //ascii of '\0' is 0
        printf("\n");

        float farr[3] = {1.1, 2.2};
        for(int i = 0; i < 3; i++)
                printf("%f ", farr[i]);
        printf("\n");

        long larr[3] = {11};
        for(int i = 0; i < 3; i++)
                printf("%ld ", larr[i]);
        printf("\n");

        double darr[3] = {1.1};
        for(int i = 0; i < 3; i++)
                printf("%lf ", darr[i]);
        printf("\n");
}
