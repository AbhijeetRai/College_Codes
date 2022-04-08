/**
 * Once we have address of constant variable stored in (general) pointer.
 * we can change value of constant variable, too. From, pointer only.
 */

#include<stdio.h>

void main() {

        const int a = 10;
        int *ptr = &a;
        *ptr = 20;
        printf("%d\n", a);


        //a = 20;       //constant value cannot be modified
}
