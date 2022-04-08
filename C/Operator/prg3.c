#include <stdio.h>

void main() {

        int a = 10;
        int b = 20;

        //Error
        //Lvalue required as left operand of assignment
        a+1 = b;
        printf("%d\n",a);
}
