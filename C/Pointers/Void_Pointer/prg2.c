#include<stdio.h>

void main() {

    int arr[] = {1, 2, 3};
    //Let us suppose addressing scheme of arr. 
    //1 is at address 100. 2 is at address 104. 3 is at address 108 (to 112).
    //When we dereference 'ptr'. Ptr says, I am an "integer pointer".
    //"I will try to read an integer", from address where I am currently pointing. 
    //Which is 100, so it reads an integer at address (100 - 103) and prints it.  

    int *ptr = arr;
    printf("%d\n", *ptr);

    void *vptr = arr;
    //ptr said, I am an integer pointer. I try to read integer values. 
    //But vptr cannot blindly say, I am a void pointer. I will try to read void.
    //Which is why direct dereference of void pointer is not allowed. 
    printf("%d\n", *vptr);
}