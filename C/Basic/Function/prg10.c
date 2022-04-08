#include<stdio.h>

int fun();

void main() {

        //no error because protyoe is same on line 3
        //will give error for parametrised protype like prg11
        fun();
}

int fun(int a) {

        printf("In fun --int-- parameter...\n");
}
