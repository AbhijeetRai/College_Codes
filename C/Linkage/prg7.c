#include<stdio.h>

void gun() {

        int a = 10;
        a += 1;
        printf("%d\n", a);
}

void fun() {

        //this variable, 'a' is not visible outside fun().
        //but persists it data like global variable, because it is stored
        //in data section
        static int a = 10;
        a += 1;
        printf("%d\n", a);
}

void main() {

        fun();
        fun();
        fun();
        printf("\n\n");

        gun();
        gun();
        gun();
}
