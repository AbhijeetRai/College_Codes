#include<stdio.h>

void main() {
	
	printf("We are going to study goto statement\n");

	goodmorning :
		printf("Good morning!!!\n");
		printf("Have a nice day\n");

	goto goodmorning;
}
