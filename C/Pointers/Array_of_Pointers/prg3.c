#include<stdio.h>

/*
 * Function: main
 * --------------   
 * Illustrates the working of array of 'pointer to pointer'.
 * 
 * returns: exit code 0 to the operating system.
 */ 

int main(void) {

    int variable_a = 10;
    int variable_b = 20;
    int variable_c = 30;

    int *ptr1 = &variable_a;
    int *ptr2 = &variable_b;
    int *ptr3 = &variable_c;

    int **pptr1 = &ptr1;
    int **pptr2 = &ptr2;
    int **pptr3 = &ptr3;

    int **arr_dptr[] = {pptr1, pptr2, pptr3};

    printf("%d %d %d %d %d\n", variable_a, *ptr1, **pptr1, **arr_dptr[0], ***(arr_dptr + 0));
    printf("%d %d %d %d %d\n", variable_b, *ptr2, **pptr2, **arr_dptr[1], ***(arr_dptr + 1));
    printf("%d %d %d %d %d\n", variable_c, *ptr3, **pptr3, **arr_dptr[2], ***(arr_dptr + 2));

    return 0;
}
