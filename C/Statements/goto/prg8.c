#include<stdio.h>

void main() {

	fordemo:
		printf("Printing\n");

	for(int i = 1; i <= 3; ++i)
		goto fordemo;
	
	/**
	 * Once go to statement is completed, program does not resume to increment i, (like with regular statement in for loop)
	 * rather intialization of i happens again, as after 'fordemo:' evaluation, flow of program is top-down
	 */
}
