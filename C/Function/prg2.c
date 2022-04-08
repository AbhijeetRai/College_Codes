#include <stdio.h>

void run(void);             //writing void, if no parameter is there, is okay
void gun(int, float);       //writing only data type of parameter is okay
void fun(char ch);          //changing identifier is okay

void main() {

    run();
    gun(10, 10.1);
    fun('A');
}

void run() {

    printf("In run\n");
}

void gun(int a, float b) {

    printf("In gun\n");
}

void fun(char c) {

    printf("In fun\n");
}