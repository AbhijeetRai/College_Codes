#include<stdio.h>

void func2(int *ptr) {

        for(int i = 0; i < 4; i++)
                printf("%d ", *(ptr + i));
        printf("\n");
}

void func1(int brr[]) {

        for(int i = 0; i < 4; i++)
                printf("%d ", brr[i]);
        printf("\n");
}

void main() {

        int arr[] = {1001, 2001, 3001, 4001};
        func1(arr);     //sending array, catching with array
        func2(arr);     //sending array, catching with pointer
}
