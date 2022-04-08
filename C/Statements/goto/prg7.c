#include<stdio.h>

void main() {
	
	int x = 10;

	for(int i = 1; i <= x; ++i)
		goto fordemo;

	fordemo:
		printf("Printing\n");
}
