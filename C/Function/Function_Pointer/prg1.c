#include<stdio.h>

void add(int x, int y) {

        printf("%d\n", x + y);
}

void sub(int x, int y) {

        printf("%d\n", x - y);
}

void main() {

        //declare karne k do tarike - prototype me identifier optional
        //initialise karne k do tarike - initialise karne k lie function ka address optional
        //call karne k do tarike - dereference is optional

        void (*fptr1)(int x, int y) = add;
        fptr1(10, 10);

        void (*fptr2)(int, int) = &sub;
        (*fptr2)(20, 10);
}
