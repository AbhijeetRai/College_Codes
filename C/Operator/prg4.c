#include<stdio.h>

void main() {
	
	int a = 5, b = 6, c = 7, answer;

	answer = a + b - c;
	printf("%d\n", answer);

	answer = a * b / c;
	printf("%d\n", answer);

	answer = a + b / c - a * b;
	printf("%d\n", answer);

	answer = (a + b) / c - a * b;
	printf("%d\n", answer);
	
}
