#include<stdio.h>

void main() {

        int first,second;
        printf("Enter two values\n");
        scanf("%d%d",&first,&second);

        printf("Address of first value in int fromat = %d\n",&first);
        printf("Address of second value in int fromat = %d\n",&second);

        printf("Address of first value in hex fromat = %p\n",&first);
        printf("Address of second value in hex fromat = %p\n",&second);
}
