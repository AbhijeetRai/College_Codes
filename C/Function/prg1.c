#include <stdio.h>

/**
 * At compile time, compiler must be aware of return type/ parameter of ipl.
 * To make compiler aware, write prototype of ipl, or define it above main. 
 */

void main() {

    ipl();  
}

void ipl() {

    printf("IPL 2020\n");
}