//How to access global variable, if local variable exists with same name/ identifier

#include<stdio.h>

int a = 10;

void main() {
	
	int a = 0;
	printf("%d\n", a);

	{
	
		extern int a;
		printf("%d\n", a);
	}
}
