#include <stdio.h>

void main() {

    double a = 10.0;
    double *pointer = &a;
    int val1 = pointer;

    pointer = pointer - 'B';
    //pointer = pointer - 66; (ASCII of B is 66)
    //pointer = pointer - 66 * size(data type of pointer)
    //pointer = pointer - 66 * 8
    //pointer = pointer - 528

    int val2 = pointer;
    printf("%d\n", val1 - val2);
}