#include<stdio.h>

void main() {
	
	extern int a; 	//even if a is declaration statement, it does not hold space in memory

	//still sizeof assumes size of a, thinking some 'int' 'a' might come later
	printf("Size of a is %ld\n", sizeof(a));



	extern char b; 	//even if b is declaration statement, it does not hold space in memory

	//still sizeof assumes size of b, thinking some 'char' 'b' might come later
	printf("Size of b is %ld\n", sizeof(b));
}
