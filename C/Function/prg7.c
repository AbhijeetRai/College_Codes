#include<stdio.h>

void func(int *ptr) {

        for(int i = 0; i < 4; i++)
                printf("%d ", *(ptr + i));
        printf("\n");
}

void main() {

        int arr[] = {101, 201, 301, 401};
        //passing address of 0th element
        func(&arr[0]);
}
