/**
 * '++'(increment) has higher precedence than '*'(dereference)
 */

#include<stdio.h>

void main() {

    int arr[] = {11, 22, 33, 44, 55};
    int *ptr = arr;

    printf("%d\n", *ptr++);
    /*
     * ptr++ means
     * temp = ptr
     * ptr = ptr + 1
     * return temp
     * resultant pointer is looking at 11, and ptr is looking at 22
     */

    printf("%d\n", (*ptr)++);
    /**
     * '*ptr' is first found out, then post incremented. I.e.
     * temp = *ptr;
     * '*ptr' = *ptr + 1
     * return temp
     * arr[1] is 23 now, *ptr is at 23 now
     */
    printf("arr[1] is %d and *ptr is %d\n", arr[1], *ptr);


    printf("%d\n", *++ptr);
    /**
     * First ++ptr happens, that is
     * ptr = ptr + 1;
     * return ptr
     */ 

    printf("%d\n", ++*ptr);
    /**
     * First *ptr will happen, then ++
     */
    printf("arr[2] is %d\n", arr[2]); 
}