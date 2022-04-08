#include<stdio.h>

void main() {
	
	printf("Goto statement\n");

	goto goodafternoon;

	printf("Lunch\n");	//Unreachable statement
	printf("Snacks\n");	//Unreachable statement

	goodafternoon:
		printf("Good after noon\n");
}
