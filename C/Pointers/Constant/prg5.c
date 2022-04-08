#include<stdio.h>

int main(void) {

        const int a = 10;                //variable is constant
        const int* const ptr = &a;      //a is constant for *ptr, ptr is constant as well;

        //a += 10;        //variable cannot change itself
        //*ptr = 20;      //a is contant for *ptr

        int b = 20;
        //ptr = &b;     //ptr cannot look away towards other variable

        //But another pointer for which a is not constant, can still change a
        int *pointer = &a;
        *pointer = 101;
        printf("%d %d %d\n", a, *ptr, *pointer);

        return 0;
}
