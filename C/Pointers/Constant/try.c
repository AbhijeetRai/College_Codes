#include<stdio.h>

int main(void) {

        //if 'const int var', is same as 'int const var'
        const int a = 10;
        //a += 10;              //error
        int const b = 20;
        //b += 10;              //error

        //then const int *ptr must be same as int const *ptr
        int c = 100;
        const int *pointer = &c;
        //*pointer = 200;         //error
        int d = 200;
        pointer = &d;
        printf("%d\n", *pointer);

        int e = 1000;
        int const *ptr = &e;
        //*ptr = 2000;           //error
        int f = 2000;
        ptr = &f;
        printf("%d\n", *ptr);

        //constant pointer
        long g = 100000;
        long* const pr = &g;
        *pr = 200000;
        printf("%ld\n", *pr);
        long h = 300000;
        //pr = &g;              //error

        return 0;
}

/**
 *  Synatax
 *  
 * Constant values
 *      const int a;
 *      int const a;
 * 
 * Pointer to constant
 *      const int *ptr
 *      int const *ptr
 * 
 * Constant pointer, to constant
 *      const char* const ptr 
 *      char const* const ptr
 * 
 * Constant pointer
 *      int* const pointer
 */