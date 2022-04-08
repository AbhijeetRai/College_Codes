#include<stdio.h>

/**
 *          0       1       2
 * 
 *  0       1       2       3
 *  
 *  1       4       5       6
 *  
 *  2       7       8       9
 */ 

void main() {

    int arr[][3] = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    printf("%d\n", 0[arr][0]);
    printf("%d\n", arr[0][0]);
    printf("%d\n", *(*(arr + 0) + 0));
    printf("\n");

    printf("%d\n", 2[arr][0]);
    printf("%d\n", arr[2][0]);
    printf("%d\n", *(*(arr + 2) + 0));
    printf("\n");

    printf("%d\n", 1[arr][2]);
    printf("%d\n", arr[1][2]);
    printf("%d\n", *(*(arr + 1) + 2));
}