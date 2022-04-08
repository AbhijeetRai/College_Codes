#include<stdio.h>

int arith2() {

        int sum = 3 + 2;
        int mul = 3 * 2;
        int div = 3 / 2;
                                   //Right most value is returned
        return(sum, mul, div);     //Okay to return multiple values
}

int arith1() {

        int sum = 3 + 2;
        int mul = 3 * 2;
        int div = 3 / 2;
                                   //Right most value is returned
        return sum, mul, div;      //Okay to return multiple values
}

void main() {

        int a1 = arith1();
        printf("a1 is %d\n", a1);

        int a2 = arith2();
        printf("a2 is %d\n", a2);
}
