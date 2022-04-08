#include<stdio.h>

void func(int (*ptr)[4]) {

        for(int i = 0; i < 4; i++)
                printf("%d ", *(*ptr + i));
        printf("\n");
}

void main() {

        int arr[] = {10, 20, 30, 40};

        //sending whole array('s address) to function
        func(&arr);
}
