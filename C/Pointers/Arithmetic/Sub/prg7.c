#include<stdio.h>

void main() {

    int a[] = {10, 20, 30, 40, 50};
    int *ptr = &a[4];

    printf("%d\n", *ptr--);
    //First ptr-- happens then *
    //temp = ptr
    //ptr = ptr - 1
    //return temp
    //resultant pointer is at 50, it will print 50
    //ptr is at 40
    printf("*ptr is %d\n", *ptr);

    printf("%d\n", (*ptr)--);
    //ptr is at 40, 40 will be printed as of now, and reduced by 1 later
    //(*ptr)-- means
    //temp = *ptr
    //*ptr = *ptr-1
    //return temp     
    printf("%d is *ptr %d is a[3]\n", *ptr, a[3]);

    printf("%d\n", *--ptr);
    //--ptr will happen first, then *
    //--ptr means 
    //ptr = ptr - 1
    //return ptr
    //30 will be printed

    printf("%d\n", --*ptr); 
    //* will be solved first, then --
    //--*ptr =
    //*ptr = *ptr - 1
    //return *ptr
    printf("%d\n", a[2]);
}