#include<stdio.h>

void main() {

        int a[5] = {1, 0, 2, 0, 3};
        int b[5];

        //&b[0] = &a[0];        //If this is not allowed
        //b = a;        //why would this be allowed, cannot assign array directly to another array

        for(int i = 0; i < 5; i++)
                b[i] = a[i];

        for(int i = 0; i < 5; i++)
                printf("%d ", a[i]);

        printf("\n");
}
