/**
 * C programming language has some predefined macros
 */


#include<stdio.h>

int main(int argc, char const *argv[]) {

	printf("The fine name is %s\n", __FILE__);
	printf("Today's date is %s\n", __DATE__);
	printf("Current time is %s\n", __TIME__);
	printf("This is line number %d from program\n", __LINE__);

	return 0;
}