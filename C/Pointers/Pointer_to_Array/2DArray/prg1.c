#include<stdio.h>

void main() {

    int arr[][2] = {10, 20, 30, 40};

    int (*ptr)[2][2] = &arr;

    for(int i = 0; i < 2; i++) {

        for(int j = 0; j < 2; j++)
            printf("%d ", *(*(*ptr + i) + j));
        printf("\n");
    }

    printf("\n");           //for a gap of new line

    //*ptr means base adress of whole 2D array. *ptr + i means, moves i rows ahead from base address
    //*(*ptr + i) means address of 'i'th row. *(*ptr + i) + j means moves 'j' column ahead from address of ith row.
    //*(*(*ptr + i) + j) means value at jth column.

    //*(*(*ptr + i) + j) can be taken as
    // *(*(*(ptr + 0) + i) + j)
    //ptr[0][i][j]

    for(int i = 0; i < 2; i++) {

        for(int j = 0; j < 2; j++)
            printf("%d ", ptr[0][i][j]);
        printf("\n");
    }
}