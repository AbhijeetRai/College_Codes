#include<stdio.h>

void main() {
	
	int a = 5, b = 0, c = 4;
	
	// c works on 0 and 1, instead of actual value in python
	printf("%d\n", a && b || c);
}
