//returning function pointer.
#include<stdio.h>

int add(int x, int y) {

        return x + y;
}

//A function 'fun' that takes no input, but returns a pointer to, function called add.
//add takes two input as int, and returns an int as output
int (*fun())(int, int) {

        int (*fptr)(int, int) = add;
        return fptr;
}

void main() {

        int (*func_ptr)(int, int) = fun();
        printf("%d\n", func_ptr(2, 6));
}
