#include<stdio.h>

int main(void) {

        int a = 10;
        int b = 20;

        int *ptr = &a;  //non constant pointer
        printf("%d\n", *ptr);
        ptr = &b;
        printf("%d\n", *ptr);

        int* const pointer = &a; //constant pointer
        printf("%d\n", *pointer);
        //pointer = &b; //constant pointer cannot look towards other variable

        return 0;
}
