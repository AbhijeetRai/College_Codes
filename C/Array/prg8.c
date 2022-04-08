#include<stdio.h>

void main() {

        int a[3] = {1, 2, 3};
        int b[3] = {1, 2, 3};

        if(a == b)
                printf("Same\n");

        /*
        a = &a[0] and b = &b[0] then
        Obviously different because &a[0] != &b[0]
        */

        else
                printf("Different\n");
}
