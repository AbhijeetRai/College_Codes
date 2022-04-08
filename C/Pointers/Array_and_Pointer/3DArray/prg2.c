#include<stdio.h>

void main() {

    int arr[][2][2] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120};

    printf("%d\n", arr[2][1][1]);
    printf("%d\n", *(*(*(arr + 2) + 1) + 1));
}