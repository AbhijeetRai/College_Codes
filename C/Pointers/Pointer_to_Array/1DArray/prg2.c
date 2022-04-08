#include<stdio.h>

void main() {

    int arr[] = {10, 20, 30, 40, 50};
    int (*ptr)[5] = &arr;

    for(int i = 0; i < 5; i++)
        printf("%d\n", *(*ptr + i));

    //*ptr means base address of row
    //*ptr + i means, move 'i' ahead from base address to address 'x'
    //*(*ptr + i) means, find value at address 'x'

    //*(*ptr + i) can be seen as 
    // *(*(ptr + 0) + i) where i is column 
    //and if from previous program *(ptr + i) = ptr[i]
    //then *(*(ptr + 0) + i) = ptr[0][i] 

    printf("\n");
    for(int i = 0; i < 5; i++)
        printf("%d ", ptr[0][i]);
    printf("\n");
}