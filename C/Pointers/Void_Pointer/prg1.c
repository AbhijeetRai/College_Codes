#include<stdio.h>

void main() {

    int a = 10;
    void *ptr = &a;     //void pointer can look towards any variable
    printf("%p %p\n", &a, ptr);
}