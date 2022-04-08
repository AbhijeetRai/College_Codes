#include<stdio.h>

void fun() {

        //Macro processor has top down approach, pi cannot be found here
        printf("%f\n", pi);
}

void gun() {

        #define pi 3.14
}

void main() {

        printf("%f\n", pi);
}

void run() {

        #undef pi
}

void nun() {

        //pi cannot be found here, as it 'undef'(ed) at line 21.
        //Macros use top down appraoch and thus pi cannot be used below line 21
        printf("%f\n", pi)
}
