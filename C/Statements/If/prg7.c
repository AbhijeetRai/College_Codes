#include<stdio.h>

void main(void) {
	
	/**
	 * Size of returns size_t, which is unsigned, so for comparison sake -1 
	 * is being converted to very large unsigned number. Hence we get false

	 * Use -Wextra flag to compile
	 */
	if(sizeof(int) > -1)
		printf("True\n");
	
	else
		printf("False\n");
}
