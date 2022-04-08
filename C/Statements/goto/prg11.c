#include<stdio.h>

void main() {

	int i = 1;

	fordemo:
		printf("Printing\n");

	for(; i <= 3;) {

		++i;
		goto fordemo;
	}
	
}
