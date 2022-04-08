#include<stdio.h>

void main() {

        int a = 10;
        const int* ptr = &a;    //a is made constant for *ptr 'ONLY'. Note ptr is not constant

        //ptr is made pointer to constant
        //*ptr = 20;     //pointed data cannot be changed, by pointer

        a = 20;         //but variable can change itself.
        printf("%d %d\n", a, *ptr);

        int* pointer = &a;
        *pointer = 30;      //another pointer can change data
        printf("%d %d %d\n", *ptr, *pointer, a);

}
