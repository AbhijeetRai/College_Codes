#include<stdio.h>

#define size 2

void main() {

        //Error because, what if length is increased or decreased in code
        int length = 4;
        //int arr1[length] = {1, 2, 3, 4};

        //Error because what if width is entered, less than required, by user.
        int width;
        printf("Enter width of array\n");
        scanf("%d", &width);
        //int arr2[width] = {1, 2, 3};

        //But here no error because size is treated as compile time constant
        int arr3[size] = {1, 2};
}
