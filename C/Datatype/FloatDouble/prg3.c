#include<stdio.h>

void main() {

    int i = 1;

    for(int k = 2; k <= 4; k++) {

        int i = 3;      //new inside for
    }
    printf("%d\n", i);


    float f = 1.1;
    for(int k = 2; k <= 4; k++) {

        f = 5.5;    //override the old one
    }
    printf("%f\n", f);
}
