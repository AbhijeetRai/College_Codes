#include<stdio.h>

void main() {

    char ch = 'A';
    char cha = 'Z';

    const char *ptr1 = &ch;
    //*ptr1 = 'B';              //Error
    ptr1 = &cha;                //Pointer is not constant, so it can look elsewhere

    char const *ptr2 = &ch;
    //*ptr2 = 'B';              //Error
    ptr2 = &cha;                //Pointer is not constant, so it can look elsewhere

    const char * const ptr3 = &ch;
    //*ptr3 = 'B';              //Error
    //ptr3 = &cha;              //Error

    char const * const ptr4 = &ch;
    //*ptr4 = 'B';              //Error
    //ptr4 = &cha;              //Error
}