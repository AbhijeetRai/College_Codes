//If we want some variable to be stored on register, instead of RAM.
//we can use storage class register, for faster access
#include<stdio.h>

void main() {

        //still there is no gurantee, that it will be stored on register
        register int b = 20;
        printf("%d\n", b);

        //address of register variable cannot be printed
        //printf("%p\n", &b);
}
