#include<stdio.h>

void gun();

void main() {

	printf("c   d\n");

	/** Even though static variable is stored in data segment like static varibale, it's scope is limited to function*/
	/** it is declared and thus error on line 12*/

	printf("%d\n",d);

	for(int i = 1; i <= 10; i++) {

		gun();
	}
}

void gun() {

	int c = 10;
	/** Static variable is saving previous state from data segment*/
	static int d = 10;

	c = c + 1;
	d = d + 1;

	printf("%d  %d\n",c,d); 
}
