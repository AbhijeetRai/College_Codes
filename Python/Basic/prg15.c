#include<stdio.h>
void fun();

int a;
int *ptr = &a;
a = 10;

void main() {

        fun();
}

void fun() {

        printf("%d\t",*ptr);
}
