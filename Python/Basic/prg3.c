#include <stdio.h>

void fun();


int main() {

	fun();
}


void fun() {

	printf("HI\n");
}

void fun(int a) {

	printf("Hi Int");
}

/**
 * Method overloading does not work in c 
 */