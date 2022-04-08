#include <stdio.h>

void main() {

    long arr[] = {11l, 21l, 51l, 101l, 151l, 201, 251};
    long *ptr = &arr[5];
    int val1 = ptr;

    ptr = ptr - 4;
    //ptr = ptr - 4 * sizeof(Data type of ptr)
    //ptr = ptr - 4 * sizeof(long)
    //ptr = ptr - 4 * 8
    //ptr = ptr - 32
    int val2 = ptr;

    printf("ptr at value %ld with difference %d\n", *ptr, val1 - val2); 
}