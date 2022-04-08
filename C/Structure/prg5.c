//A structure can be created locally as well.

#include<stdio.h>

void main() {

    struct player {

        int runs;
        int sixes;
        float avg;
    }sachin;

    struct player raina;

    printf("%ld\n", sizeof(sachin));
    printf("%ld\n", sizeof(raina));
}

void fun() {

    struct player dhoni;
}