#include<stdio.h>

void main() {
	
	//error - ‘a’ has both ‘extern’ and initializer
	extern int a = 20;	//a is declaration statement, it has no space in memory, it cannot hold anything
}
