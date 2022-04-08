#include<stdio.h>

int main(int argc, char *const argv[]) {

        //global variables have extern linkage, by default
        //but we have to tell compiler explicitly to look for
        //variable "a" in prg4.c, by using 'extern' keyword
        extern int a;
        printf("%d\n", a);
        return 0;
}
