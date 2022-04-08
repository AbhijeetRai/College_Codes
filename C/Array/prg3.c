#include<stdio.h>

void main() {

        int iarr[4] = {'A', 'B', 'C', 68};
        //chars will be stored in integer format, hence size of array is 16
        printf("%ld\n", sizeof(iarr));

        char carr[4] = {65, 66.1, 'c', 1};
        printf("%ld\n", sizeof(carr));
}
