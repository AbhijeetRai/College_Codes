#include<stdio.h>

void main() {

    char carr[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};

    char   *cptr = carr;
    int    *iptr = carr;    //deliberately pointing integer pointer to character array

    cptr = cptr + 1;
    iptr = iptr + 1;

    //Although, integer pointer can store address of character variable, incrementing 
    //integer pointer moves it ahead by 4 bytes.

    printf("%c\n", *cptr);
    printf("%c\n", *iptr);
}
