#include<stdio.h>

void fun();

void main() {

        //accpted because of prototype on line 3
        // will give error if prototype of fun is made like fun on line 12. See program 8b
        fun();
}

void fun(void fun()) {

        printf("In fun no parameter...\n");
}
