#include<stdio.h>

void main() {

    int iarr[4] = {10, 20, 30, 40};
    char carr[4] = {'A', 'B', 'C', 'D'};

    void *vptr1 = iarr;
    void *vptr2 = carr;

    printf("%d\n", *(int *)vptr1);
    printf("%c\n", *(char *)vptr2);

    vptr1 = vptr1 + 1;
    vptr2 = vptr2 + 1;
    //vptr1 = vptr1 + 1, means internally calculation will happen like this
    //vptr1 = vptr1 + 1 * sizeof(data type of vptr1)
    //vptr1 = vptr1 + 1 * sizeof(void)
    //Size of void just for represenation is 1, actual is 0
    
    //So even if incrementing void pointer directly does not give us error.
    //The behavior is errorneous(error like) and buggy. Hence typecast void pointer into 
    //relevant data type pointer before performing arithmetic operations on it.

    printf("%d\n", *(int *)vptr1);
    printf("%c\n", *(char *)vptr2);
}