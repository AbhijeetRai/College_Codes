#include<stdio.h>
#define a 10

void fun();

void gun() {

    #ifndef a
    printf("not defined gun\n");

    #else 
    printf("defined gun\n");

    #endif

    #undef a
}

/**
 * Macros and their definition are immune to call of stack. 
 * Use top down approach and forget call of stack
 * to find the scope of definition of macro.
 */ 

void main() {

    fun();
    gun();
}

void fun() {

    #ifndef a
    printf("not defined fun\n");

    #else 
    printf("defined fun\n");

    #endif
}