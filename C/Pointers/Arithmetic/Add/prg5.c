#include<stdio.h>

void main() {

    int a = 10;
    int *ptr = &a;
    int* *pointer = &ptr;

    /**
     * Int pointer or pointer to int, moves ahead by 4-4 bytes, when incremented. (to access next integer in array, if pointed to array).
     * Similarly, pointer to pointer will move ahead by 8-8 bytes to access next pointer. (in array, if pointed to array of pointers). 
     */ 

    printf("%p %p\n", pointer, pointer + 1);
} 