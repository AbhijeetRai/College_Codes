/**
 * It is a good practise that if variable is decalred constant then
 * (data associated with address of variable), should be made constant, FOR POINTER ONLY.
 */

#include<stdio.h>

void main() {

        const int a = 10;
        const int* ptr = &a;    //a is made constant for *ptr, ptr is not constant

        //a += 10;      //variable cannot change itself
        //*ptr = 20;      //a is constant for *ptr, *ptr cannot assign value to it.

        //But another pointer can change a, for which a is not constant
        int* pointer = &a;
        *pointer = 300;
        printf("%d %d %d\n", a, *ptr, *pointer);
}
