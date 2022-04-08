#include<stdio.h>

void main() {

        char carr[3 + 2] = {'A', 'B', 'C'};
        printf("%ld\n", sizeof(carr));

        int size;
        printf("Enter size for integer array\n");
        scanf("%d", &size);
        //declaring array after asking size, without giving '{}' is fine.
        int iarr[size];
        printf("%ld\n", sizeof(iarr));


        /*
        But, never ask for size and initialise array at the same time
        Compiler thinks, what if user enters less size than actual number of initializers
        Hence error comes in code
        */
        int sije;
        printf("Enter size for float array\n");
        //float farr[sije] = {1.1, 2.2, 3.3};
}
