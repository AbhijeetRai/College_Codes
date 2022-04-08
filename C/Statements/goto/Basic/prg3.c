#include<stdio.h>

void main() {
	
	int i = 1;

	goodmorning:
		printf("Good morning\n");

	for(; i<= 1;) {

		i++;
		goto goodmorning;
	}
}
