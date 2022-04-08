#include<stdio.h>

void main() {

    int arr[][2][2] = {1, 2, 3, 4, 5, 6, 7, 8};
    int (*ptr)[2][2][2] = &arr; 

    for(int i = 0; i < 2; i++) {

        for(int j = 0; j < 2; j++) {

            for(int k = 0; k < 2; k++)
                printf("%d ", *(*(*(*ptr + i) + j) + k));
            printf("\n");
        }

        printf("\n\n");
    }

    printf("\n\n\n"); //for gap while printing

    //*ptr means base address of whole 3D array as one.
    //*ptr + i means move to 'i'th 2D array inside 3D array
    //*(*ptr + i) is base address of 'i'th 2D array.
    //*(*ptr + i) + j means move j rows ahead in 'i'th 2D array
    //*(*(*ptr + i) + j) means base address of 'j'th row.
    //*(*(*ptr + i) + j) + k, means move k columns ahead in 'j'th row.
    //*(*(*(*ptr + i) + j) + k) means value at 'k'th column.

    //*(*(*(*ptr + i) + j) + k) can be taken as 
    //*(*(*(*(ptr + 0) + i) + j) + k)
    //which means ptr[0][i][j][k]

    for(int i = 0; i < 2; i++) {

        for(int j = 0; j < 2; j++) {

            for(int k = 0; k < 2; k++)
                printf("%d ", ptr[0][i][j][k]);
            printf("\n");
        }

        printf("\n\n");
    }
}