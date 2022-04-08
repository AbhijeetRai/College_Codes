#include<stdio.h>

void main() {

        char ch = 'S';
        char* cptr = &ch;
        printf("Size of character pointer is %ld\n", sizeof(cptr));

        int var = 10;
        int* iptr = &var;
        printf("Size of integer pointer is %ld\n", sizeof(iptr));

        float f = 20.5;
        float* fptr = &f;
        printf("Size of float pointer is %ld\n", sizeof(fptr));

        double d = 38.50;
        double* dptr = &d;
        printf("Size of double pointer is %ld\n", sizeof(dptr));
}
