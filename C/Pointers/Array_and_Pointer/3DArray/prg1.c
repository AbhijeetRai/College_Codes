#include<stdio.h>

void main() {

    int arr[][2][2] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120};

    printf("Addressing scheme for 3DArray\n");

    for(int i = 0; i < 3; i++) {

        for(int j = 0; j < 2; j++) {

            for(int k = 0; k < 2; k++)
                printf("%p ", &arr[i][j][k]);
            printf("\n");
        }
        printf("\n");
    }
}