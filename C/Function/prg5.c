#include<stdio.h>

void func(int temp) {

        printf("%c\n", temp);
}

void main() {

        int arr[] = {65, 66, 67, 68};

        //sending one by one element to function
        for(int i = 0; i <= 3; i++)
                func(arr[i]);
}
