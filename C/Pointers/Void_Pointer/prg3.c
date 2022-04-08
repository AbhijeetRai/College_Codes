#include<stdio.h>

void main() {

    int arr[] = {1, 2, 3};
    //Let us suppose addressing scheme of arr.
    //1 is at address 100. 2 is at address 104. 3 is at address 108.
    //When we dereference 'ptr'. Ptr says I am in "integer pointer".
    //"I will try to read an integer", from address where I am currently pointing at.
    //Which is 100, so it reads an integer at address (100 - 103).

    int *ptr = arr;
    printf("%d\n", *ptr);

    void *vptr = arr;
    //But vptr cannot directly say, I am a void pointer. I will read void
    //Which is why direct dereference of vptr is not allowed. 
    //Typecast vptr into int pointer, and then when we will dereference vptr
    //vptr reads an int for us.

    printf("%d\n", *(int *)vptr);
}