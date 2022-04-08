#include<stdio.h>

int sub(int x, int y) {

        return x - y;
}

//A function called gun, that returns a function pointer to sub
int (*gun())(int, int) {

        return sub;
 }

void main() {

        printf("%d\n", gun()(6, 3) );
}
