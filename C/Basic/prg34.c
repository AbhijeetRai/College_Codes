#include<stdio.h>

void main() {
	
	int i = 1, j = 0;
	
	// not first value(i = 1) for '&&' is true, thus '&&' goes to execute second operand and j becomes 11
	// // no nither is i 0, nor j is 0. Thus it prints statement inside if
	if(i && (j = i + 10))
		printf("Inside if j is %d\n", j);

	printf("%d\n", j);
}

