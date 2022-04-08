#include<stdio.h>

int main(void) {

         int a = 10, b = 20;

         int* const ptr = &a;
         //ptr = &b;    //pointer is constant

         int** pointer = &ptr;
         *pointer = &b;
         printf("%d\n", *ptr);

        return 0;
}
