#include <stdio.h>

int gun();

void main() {

        //even though we have told compiler to look for "int val"
        //in different file, explicitly in prg6.c
        //we have used keyword 'static' in front of global variable
        //val of prg6.c.
        //using static keyword for global variable, gives it
        //intern (internal) linkage. That means it is not visible
        //outside the file.

        //extern int val;
        //printf("%d\n", val);

        //we compile prg5.c prg6.c at once
        //and call gun of prg6.c from prg5.c
        //by default gun would have been visible from prg5.c
        //because functions have storage class extern
        //but we use storage class static to limit visiblity
        //of a function in the same(enclosing) file. 
        int temp = gun();
        printf("%d\n", temp);
}
