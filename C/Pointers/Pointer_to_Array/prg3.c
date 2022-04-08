#include <stdio.h>

void main() {

    int arr1[][2] = {10, 20, 30, 40};
    int (*ptr)[2] = arr1;                   //&arr1[0]

    for(int i = 0; i < 2; i++) {

        for(int j = 0; j < 2; j++) 
            printf("%d ", *(*(ptr + i) + j) );
        printf("\n");
    }

    int arr2[][2][2] = {1, 2, 3, 4, 5, 6, 7, 8};
    int (*pointer)[2][2] = arr2;             //&arr[0]

    printf("\n\n\n");

    for(int i = 0; i < 2; i++) {

        for(int j = 0; j < 2; j++) {

            for(int k = 0; k < 2; k ++) 
                printf("%d ", *(*(*(pointer + i) + j) + k) );
            printf("\n");
        }
        printf("\n");
    }
}