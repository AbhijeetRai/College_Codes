#include <stdio.h>

int main(void) {

    int a = 10;
    int b = 20;

    //a and b have been allocated consecutive virtual addresses, differing by 4 bytes. 
    printf("a at %p with value %d\n", &a, a);
    printf("b at %p with value %d\n", &b, b);

    int *pointer = &a;
    printf("pointer pointing at address %p with value %d\n", pointer, *pointer);

    /**
     * As variable 'pointer' is 'integer pointer' (int* pointer), and stores address of variable 'a'.
     * If variable 'pointer' is incremented by 1, the value inside 'pointer' will be added by 1 * 4(size of integer), 4 bytes.
     * If value inside 'pointer' variable is added by 4 bytes, resultant pointer will start looking at 'b' variable. Because, 
     * variable 'b' is just next to variable 'a', as seen in above comment
     * 
     * If variable 'pointer' is incremented by 2, value inside 'pointer' will be added by 8 bytes and so on. 
     */
    int *answer_pointer = pointer + 1;
    printf("Resultant pointer pointing at address %p with value %d\n", answer_pointer, *answer_pointer);

    return 0;
}