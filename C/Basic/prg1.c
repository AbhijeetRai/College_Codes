#include<stdio.h>

void main() {

        int val = 1234;
        int a = printf("%d\n",val);
        int b = printf("%d\n",a);
        printf("%d\n",b);
}

/**
 * Sabse pahle val will be printed - 1234
 * on line 6, %d has value 1234, that is length is 4, and add one in length for '\n'
 * so a will hold value 5

 * on line 7 a or %d holds value 5 (length 1) and add 1 length for '\n'
 * so b will hold value 2
 */
