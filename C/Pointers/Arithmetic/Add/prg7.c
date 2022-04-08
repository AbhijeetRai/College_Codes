#include<stdio.h>

void main() {

    long a = 10l;
    long *pointer = &a;

    int val1 = pointer;
    printf("Long pointer initially at %d\n", val1);

    pointer = pointer + '!';     //'!' is 33.
    //pointer = pointer + 33
    //pointer = pointer + 33 * sizeof(data type of pointer)
    //pointer = pointer + 33 * 8
    //pointer = pointer + 264

    int val2 = pointer;
    printf("Long pointer later at %d\n", val2);

    printf("Difference is %d\n", val2 - val1);
}