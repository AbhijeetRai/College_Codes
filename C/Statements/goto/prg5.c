#include<stdio.h>

void main() {
	
	int flag = 7;

	printf("Good morning\n");

	goodmorning:
		printf("Good morning!!!!\n");
		flag --;

	if(flag > 6)
		goto goodmorning;
}
