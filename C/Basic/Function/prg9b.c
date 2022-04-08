#include<stdio.h>

//parameters can be different in prototype
//but if return type is chnaged, it gives error of conflicting types. See program 9b.c
int fun();

void main() {

        fun();
}

void fun(void fun(int a)) {

        printf("In fun with parameter...\n");
}
