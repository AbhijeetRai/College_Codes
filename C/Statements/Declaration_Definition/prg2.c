#include<stdio.h>

void main() {
	
	//with use of keyword extern, 'a' has become declaration statement now
	//it has occupied no space in memory and it not even initalised by any garbage value
	extern int a;
	
	//if 'a' has no space in memory, how it is supposed to print a value
	printf("%d\n", a);
}
