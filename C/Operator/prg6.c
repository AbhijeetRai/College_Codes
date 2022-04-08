
#include<stdio.h>

void main() {
	
	int a = 10, answer;
	answer = ++a;
	printf("%d %d\n", a, answer);

	a = 10;
	answer = a++;
	printf("%d %d\n", a, answer);

	a = 10;
	answer = --a;
	printf("%d %d\n", a, answer);

	a = 10;
	answer = a--;
	printf("%d %d\n", a, answer);
}
