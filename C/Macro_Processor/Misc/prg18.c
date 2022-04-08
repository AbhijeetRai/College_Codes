#include<stdio.h>
#error Error - 1

void main() {

    #error Error - 0

    printf("hello, world!\n");

    for(int i = 0; i < 3; i++) {

        #error Error - 2
    }
}

//We can directly use #error, wherever we want