#include<stdio.h>

void main() {

    float a[] = {1.1, 2.2};
    float *ptr = a;

    ptr = ptr - 4.5;
    //Now you might think
    //ptr - 4.5 =
    //ptr - 4.5 * sizeof(data type of ptr)
    //ptr - 4 .5 * sizeof(float)
    //ptr - 4.5 * 4
    //ptr - 18
    //But pointer substraction is not supported with double & float

    ptr = ptr - 4.5f; 
}