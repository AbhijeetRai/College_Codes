#include<stdio.h>

void main() {

        float farr[5];

        printf("%p\n", &farr[0]);
        printf("%p\n", farr);

        if(farr == &farr[0])
                printf("Same\n");
}
