#include<stdio.h>

void main() {

        int first,second;
        printf("Enter two values\n");
        scanf("%d%d", &first, &second);

        printf("Address of first value using ls = %ls\n",&first);
        printf("Address of first value using ls = %ls\n",&second);

}
