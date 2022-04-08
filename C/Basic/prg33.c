#include<stdio.h>

void main() {
	
	int i = 0, j = 0;
	
	// && find first operand (i = 0)false, that is what && needs, then it does not execute right operand,
	// takes 0 and terminates if, does not go  inside if, and print j = 0
	if(i && (j = i + 10))
		printf("Inside if j is %d\n", j);

	printf("%d\n", j);
}
