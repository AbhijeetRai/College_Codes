#include<stdio.h>

void main() {

        const int first, second;
        int val1, val2;

        /**
         * We can read the value into constant variable.
         */
        printf("Enter the first and second\n");
        scanf("%d%d", &first, &second);

        //const values can be read
        val1 = first + 1;
        val2 = second + 2;

        printf("Val1 = %d\nVal2 = %d\n",val1,val2);
}
