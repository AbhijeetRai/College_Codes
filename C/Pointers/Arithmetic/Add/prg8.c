#include<stdio.h>

void main() {

    int a = 10;
    int *ptr = &a;
    float inc = 2.5;

    ptr = ptr + inc;
    //Now you might think
    //ptr = ptr + 2.5
    //ptr = ptr + 2.5 * sizeof(data type of ptr)
    //ptr = ptr + 2.5 * 4
    //ptr = ptr + 10
    //But addition of pointer and float is not supported

    ptr = ptr + 10.0;
    //ptr addition with double is not supported
}