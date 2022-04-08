#include<stdio.h>

void main() {
	
	int flag = 0;

	printf("Goto statement\n");

	goodmorning:
		printf("Good Morning!!!\n");
		printf("Have a nice day\n");
	
	if(flag == 0) {

		flag = 1;
		goto goodmorning;
	}
}
