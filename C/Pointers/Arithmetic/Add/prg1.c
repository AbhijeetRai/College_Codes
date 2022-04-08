/**
 * The addresses we print, in C program, are virtual. Physical address are actual (allocated)addresses on RAM.
 * Generally, (only) virtual address for any type of variables are consecutive. But physcial(& virtual obviosuly) 
 * addresses of array are contiguous, that is, in consecutive manner.
 */

#include<stdio.h>

int main(void) {

    int a[5];

    for(int i = 0; i < 5; i++)
        printf("%p ", &a[i]);
    printf("\n");

    return 0;
} 