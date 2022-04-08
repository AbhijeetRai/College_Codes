#include<stdio.h>

void main() {

    #if 10 > 20
        #error 10 is large

    #elif 10 == 20
        #error 10 is same

    #endif
}