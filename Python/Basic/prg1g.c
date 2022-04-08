#include<stdio.h>

void fun();

void main() {

	fun();

	printf("%d\n",d);
	printf("%d\n",d);
	printf("%d\n",d);
	printf("%d\n",d);
}

void fun() {

	static int d = 10;
}

/**
 error: ‘d’ undeclared (first use in this function)
  printf("%d\n",d);
                ^
prg1g.c:9:16: note: each undeclared identifier is reported only once for each function it appears in
 */