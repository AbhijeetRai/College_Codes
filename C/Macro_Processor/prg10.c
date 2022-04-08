#include<stdio.h>
#define pi 3.14
#define SQR(a) a * a


void fun() {

        #undef pi
        #undef SQR
        //pi and SQR will not be visible below this
}

void main() {

        printf("%f\n", pi);
        printf("%d\n", SQR(6));
}
