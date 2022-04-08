#include<stdio.h>

void fun(void fun());

void main() {

        fun();
}

void fun(void fun()) {

        printf("In fun...\n");
}
