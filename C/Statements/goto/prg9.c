#include<stdio.h>

void main() {

	int i = 3;

	fordemo:
		printf("Print---ing\n");

	for(; i <= 3; ++i)
		goto fordemo;
	
	/**
	 * Once go to statement is completed, program does not resume to increment i, (like with regular statement in for loop)
	 * rather condtion evaluation of i happens again, as after 'fordemo:' evaluation, flow of program is top-down
	 */
}
