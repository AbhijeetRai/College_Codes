//local variables by default have storage class auto.
//auto storage class signifies, storage on stack frame

#include<stdio.h>

//global variable cannot be auto, as they are stored in data segment.
//auto int c = 30;

int main() {

        auto int a = 10;
        int b = 20;

        printf("%d %d\n", a, b);
}
