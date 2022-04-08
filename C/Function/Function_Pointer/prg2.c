#include <stdio.h>

void add(int, int);             //not giving identifier in prototype is okay
void sub(int x, int y);         //giving exact same identifier in prototype and function declaration is okay
void mul(int x, int);           //mix declaration is okay
void div(int a, int b);         //giving different identifier in prototype than function declaration is okay

void main() {

        add(2, 2);
        sub(2, 2);
        mul(2, 2);
        div(2, 2);
}

void add(int x, int y) {

        int add = x + y;
}

void sub(int x, int y) {

        int sub = x - y;
}

void mul(int x, int y) {

        int mul = x * y;
}

void div(int x, int y) {

        int div = x / y;
}
