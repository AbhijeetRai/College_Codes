#include<stdio.h>

void main() {

        char arr[3] = {'A', 'B', 'C'};

        for(int i = 0; i < 3; i++)
                printf("%p ", &arr[i]);
        printf("\n");


        int ar[4] = {1, 2, 3, 4};

        for(int i = 0; i < 4; i++)
                printf("%p ", &ar[i]);
        printf("\n");
}
