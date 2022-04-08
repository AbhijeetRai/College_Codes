#include<stdio.h>

void main() {

    int arr[] = {10, 20, 30, 40, 50, 60, 70};
    int *ptr1 = &(arr[0]);
    int *ptr2 = &(arr[6]);

    //Substraction of two pointer is supported and returns long int, by formula
    // (ptr2 - ptr1) / sizeof(datatype of ptr)
    printf("%ld\n", ptr2 - ptr1); 

    int val2 = ptr2;
    int val1 = ptr1;
    int ans = (val2 - val1) / sizeof(int);
    printf("%d\n", ans); 
}